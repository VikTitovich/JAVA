package CalculatorViewer;

import CalculatorController.Division;
import CalculatorController.ProdactOfNumbers;
import CalculatorController.Substraction;
import CalculatorController.Summary;

public class CalculatorView extends Promter {
    public CalculatorView() {
    }

    public void run() {
        while (true) {
            Float primaryNumber = promptFloat("Enter the first argument: ");
            while (true) {
                String command = prompt("Enter command ( +, -, *, /, =) : ");
                if (command.equals("+")) {
                    Float arg = promptFloat("Enter the second argument: ");
                    Summary summary = new Summary(primaryNumber);
                    summary.getSum(arg);
                    break;
                }
                if (command.equals("-")) {
                    Float arg = promptFloat("Enter the second argument: ");
                    Substraction substraction = new Substraction(primaryNumber);
                    substraction.getDif(arg);
                    break;
                }
                if (command.equals("*")) {
                    Float arg = promptFloat("Enter the second argument: ");
                    ProdactOfNumbers prodact = new ProdactOfNumbers(primaryNumber);
                    prodact.getMult(arg);
                    break;
                }
                if (command.equals("/")) {
                    Float arg = promptFloat("Enter the second argument: ");
                    Division division = new Division(primaryNumber);
                    division.getDiv(arg);
                    break;
                }

            }
            String command = prompt("Let's continue (Y/N)?");
            if ((command.equals("Y")) || (command.equals("y"))){
                continue;
            }
            break;
        }
    }
}
