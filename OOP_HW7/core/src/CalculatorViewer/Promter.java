package CalculatorViewer;

import java.util.Scanner;

public class Promter {
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public Float promptFloat(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Float.parseFloat(in.nextLine());
    }
}
