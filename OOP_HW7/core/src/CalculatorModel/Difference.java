package CalculatorModel;

public class Difference {
    private Float primaryNumber;

    public Difference(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float dif(Float arg){
        primaryNumber-=arg;
        System.out.printf("Result: %f \n", primaryNumber);
        return primaryNumber;
    }
}
