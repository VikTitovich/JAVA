import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(getStringInput());
    }

    public static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter String: ");
                input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("You Can't Input Empty String!");
                }
                validInput = true;
                System.out.println("Your String: " + input);
            } catch (Exception e) {
                System.out.println("!!!: " + e.getMessage());
            }
        }
        return input;
    }
}
