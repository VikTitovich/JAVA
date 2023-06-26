// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class program{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(0,100));
        }
        System.out.println("Original Array:" + "\n" + list);
        sc.close();
        System.out.println("Minimum Value: " + Collections.min(list));
        System.out.println("Maximum Value: " + Collections.max(list));
        calculateAverage(list);
        removeEvenNumbers(list);
    }    
       
    public static void calculateAverage(ArrayList<Integer> list) {
        double sum=0;
        for (Integer item : list) {
            sum+=item;    
        }
        double res = sum/list.size();
        System.out.printf("Arithmetic Mean:"+ res + "\n");
    }

    public static void removeEvenNumbers(ArrayList<Integer> list) {
        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println("Array without Even Numbers:" + "\n" + list);
    }
}