package View;

import Model.Awards;
import Model.Lottery;
import Model.Saver;
import Model.Toy;

import java.util.*;

public class UserView {
    public UserView() {
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько видов игрушек участвуют в розыгрыше: ");
        int numberOfToys = scanner.nextInt();
        // формирование ассортимента призов
        ArrayList<Toy> toysAssortment = new ArrayList<>();
        for (int i = 0; i < numberOfToys; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите название игрушки и частоту выпадения игрушки (от 1 до 10) через пробел");
            String userToy = scanner1.nextLine();
            String[] userToyData = userToy.split(" ");
            Toy toy = new Toy(userToyData[0],Integer.parseInt(userToyData[1]));
            toysAssortment.add(toy);
        }
        //формирование списка участников розыгрыша
        System.out.println("Введите количество участников розыгрыша");
        int numberOfPeople = scanner.nextInt();
        String[] peoples = new String[numberOfPeople];
        for (int i = 0; i < peoples.length; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите имя участника: ");
            peoples[i] = scanner2.nextLine();
        }
        //формирование списка призов по количеству участников розыгрыша
        Awards awardsList = new Awards();
        awardsList.create(toysAssortment,peoples);
        //получение пар победитель-приз
        Lottery lottery = new Lottery();
        Saver saver = new Saver();
        saver.save(lottery.getPrize(awardsList.namesOfAwards(),peoples));
    }
}
