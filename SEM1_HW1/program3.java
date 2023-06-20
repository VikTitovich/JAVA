// Реализовать простой калькулятор (+-/*)

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double numFirst = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter second number: ");
        double numSecond = scanner.nextDouble();

        scanner.close();
        double result = 0;

        switch (operator) {
            case "+":
                result = numFirst + numSecond;
                break;
            case "-":
                result = numFirst - numSecond;
                break;
            case "*":
                result = numFirst * numSecond;
                break;
            case "/":
                if (numSecond != 0) {
                    result = numFirst / numSecond;
                } else {
                    System.out.println("Error! division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}