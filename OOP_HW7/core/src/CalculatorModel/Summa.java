package CalculatorModel;

public class Summa {
    private Float primaryNumber;

    public Summa(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float sum(Float arg){
        primaryNumber+=arg;
        System.out.printf("Result: %f \n", primaryNumber);
        return primaryNumber;
    }

}
