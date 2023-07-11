public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        Duck donald = new Duck("Donald", "white", 30, "duck", true, true, true);
        donald.toRun();
        donald.toFly();
        donald.toSwim();
        System.out.println();

        Cat kuzya = new Cat("Kuzya", "gray", 1, true, "Mein Cun", 4, "cat", true, false, false);
        kuzya.toRun();
        kuzya.toFly();
        kuzya.toSwim();
        System.out.println();

        Dog teddi = new Dog("Teddi", "brown", 3, false, "terrier", 4, "dog", true, false, true);
        teddi.toRun();
        teddi.toFly();
        teddi.toSwim();
        System.out.println();
    }
}