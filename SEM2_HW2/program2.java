// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// 1 3 4 2
// 1 3 2 4
// 1 2 3 4

import java.io.FileWriter;

public class program2 {

    public static void bubbleSort(int[] sortArr) {
         for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) throws Exception {
        FileWriter writer = new FileWriter("file.txt");
        int[] sortArr = { 2, 65, 14, 25, 5, 10, 35 };
        bubbleSort(sortArr);
            for (int i = 0; i < sortArr.length; i++) {
                writer.write(sortArr[i] + "\n");
            }
        System.out.println("Ready!");
        writer.close();

    }
}
