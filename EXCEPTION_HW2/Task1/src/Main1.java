import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(getFloatInput());
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the Float Number: ");
                String input = scanner.nextLine();
                number = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("The Entered String is not a Float Number");
            }
        }
        return number;
    }
}
