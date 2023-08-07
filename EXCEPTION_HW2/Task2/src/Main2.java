public class Main2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[]{1,2,3,4,5,6,7,8};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
        System.out.println("-------------------------");
    }
}
