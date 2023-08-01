package CalculatorController;

import CalculatorModel.Difference;

public class Substraction {
    private Float primaryNumber;

    public Substraction(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float getDif(Float arg){
        Difference difference = new Difference(primaryNumber);
        Float dif;
        dif = (Float)difference.dif(arg);
        return dif;
    }
}
