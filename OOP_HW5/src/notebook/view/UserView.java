package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Enter command: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("Name: ");
                    String lastName = prompt("Surname: ");
                    String phone = prompt("Phone number: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("User ID: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readAllUsers();
                        System.out.println(users);
                    }catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try{
                        String name = prompt("Name: ");
                        String secondName = prompt("Surname: ");
                        String number = prompt("Phone number: ");
                        Long userId = Long.parseLong(prompt("Enter User ID: "));
                        User updated = new User(name, secondName,number);
                        userController.updateUser(userId, updated);

                    }catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case DELETE:
                    try{
                        Long userId = Long.parseLong(prompt("Enter User ID: "));
                        userController.deleteUser(userId);
                    }catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case FIND_ID:
                    try {
                        Long uId = Long.parseLong(prompt("User ID: "));
                        List<User> users = userController.readAllUsers();
                        userController.findById(users, uId);
                    }catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
