package CalculatorModel;

public class Quotient {
    private Float primaryNumber;

    public Quotient(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float quot(Float arg) {
        primaryNumber/=arg;
        System.out.printf("Result: %f \n", primaryNumber);
        return primaryNumber;
    }
}
