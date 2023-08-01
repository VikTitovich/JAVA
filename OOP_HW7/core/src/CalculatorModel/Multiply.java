package CalculatorModel;

public class Multiply {
    private Float primaryNumber;

    public Multiply(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float mult(Float arg){
        primaryNumber*=arg;
        System.out.printf("Result: %f \n", primaryNumber);
        return primaryNumber;
    }
}
