package CalculatorController;

import CalculatorModel.Summa;

public class Summary {
    private Float primaryNumber;

    public Summary(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float getSum(Float arg){
        Summa summa = new Summa(primaryNumber);
        Float sum;
        sum = (Float)summa.sum(arg);
        return sum;
    }
}
