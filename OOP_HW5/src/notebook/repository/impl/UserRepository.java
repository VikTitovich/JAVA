package notebook.repository.impl;

//import notebook.dao.Operation;
//import notebook.dao.impl.FileOperation;
import notebook.mapper.impl.UserMapper;
import notebook.model.User;
import notebook.repository.GBRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    @Override
    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User u: users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
        return user;
    }

    //@Override
    public Optional<User> findById(List<User> users,Long id) {
        User findUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println(findUser);
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long id, User user) {
        List<User> users = findAll();
        User editUser = users.stream().filter(u-> u.getId().equals(id))
                .findFirst().orElseThrow(()-> new RuntimeException("User not found"));
        editUser.setId(id);
        editUser.setFirstName(user.getFirstName());
        editUser.setLastName(user.getLastName());
        editUser.setPhone(user.getPhone());
        write(users);
        return Optional.empty();
    }

    @Override
    public void deleteUser(Long userId) {
        List<User> users = findAll();
        User editUser = users.stream().filter(u-> u.getId().equals(userId))
                .findFirst().orElseThrow(()-> new RuntimeException("User not found"));
        users.remove(editUser);
        write(users);
    }


    private void write(List<User> users){
        List<String> lines = new ArrayList<>();
        for (User u: users) {
                lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
    }

    public static class FileOperation implements Operation<String> {
        private final String fileName;

        public FileOperation(String fileName) {
            this.fileName = fileName;
            try (FileWriter writer = new FileWriter(fileName, true)) {
                writer.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        @Override
        public List<String> readAll() {
            List<String> lines = new ArrayList<>();
            try {
                File file = new File(fileName);
                //создаем объект FileReader для объекта File
                FileReader fr = new FileReader(file);
                //создаем BufferedReader с существующего FileReader для построчного считывания
                BufferedReader reader = new BufferedReader(fr);
                // считаем сначала первую строку
                String line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
                while (line != null) {
                    // считываем остальные строки в цикле
                    line = reader.readLine();
                    if (line != null) {
                        lines.add(line);
                    }
                }
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lines;
        }

        @Override
        public void saveAll(List<String> data) {
            try (FileWriter writer = new FileWriter(fileName, false)) {
                for (String line : data) {
                    // запись всей строки
                    writer.write(line);
                    // запись по символам
                    writer.append('\n');
                }
                writer.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

