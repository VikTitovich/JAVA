package CalculatorController;

import CalculatorModel.Quotient;

public class Division {
    private Float primaryNumber;

    public Division(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float getDiv(Float arg) {
        Quotient quotient = new Quotient(primaryNumber);
        Float quot;
        quot = (Float)quotient.quot(arg);
        return quot;
    }
}
