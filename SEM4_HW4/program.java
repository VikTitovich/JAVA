import java.util.*;

public class program {
    public static void main(String[] args) {

        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();

        deque1.add(1);
        deque1.addFirst(2);
        deque1.addFirst(3);

        deque2.add(3);
        deque2.addFirst(4);
        deque2.addFirst(5);

        System.out.println("\nFirst Deque:" + deque1);
        System.out.println("\nSecond Deque:" + deque2);
       
        int number1 = dequeToNumber(deque1);
        int number2 = dequeToNumber(deque2);

        System.out.println("\n----------*----------\n");
        System.out.printf("%d * %d = %d\n", number1, number2, number1 * number2);
        System.out.println("\nResult *: " + numberToDeque(number1 * number2));
        System.out.println("\n----------+----------\n");
        System.out.printf("%d + %d = %d\n", number1, number2, number1 + number2);
        System.out.println("\nResult +: " + numberToDeque(number1 + number2));
    }

    public static int dequeToNumber(Deque<Integer> deque) {
        int number = 0;
        int multiply = 1;
        while (!deque.isEmpty()) {
            int digit = deque.removeFirst();
            number += digit * multiply;
            multiply *= 10;
        }
        return number;
    }

    public static Deque<Integer> numberToDeque(int number) {
        Deque<Integer> deque = new LinkedList<>();
        while (number > 0) {
            int digit = number % 10;
            deque.addFirst(digit);
            number /= 10;
        }
        return deque;
    }
}