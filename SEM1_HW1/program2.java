// Вывести все простые числа от 1 до 1000

public class program2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            boolean isZnac = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isZnac = false;
                    break;
                }
            }
            if (isZnac && i != 1) {
                System.out.println(i);
            }
        }
    }
}