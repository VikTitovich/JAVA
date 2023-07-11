public class Cat extends Animal {
    String creature = "cat";
    Boolean run = true;
    Boolean fly = false;
    Boolean swim = false;
    
    public Cat(String name, String color, Integer age, Boolean vaccination,
            String species, Integer legsCount, String creature, Boolean run, Boolean fly, Boolean swim) {
        super(name, color, age, vaccination, species, legsCount, creature, run, fly, swim);
    }        
}