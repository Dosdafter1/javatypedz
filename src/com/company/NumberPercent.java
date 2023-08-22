package com.company;

import java.util.Scanner;
//task2
public class NumberPercent {

    private static double getPercent(double number, double percent) {
        return number * (percent/100);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        double number;
        number = scanner.nextDouble();
        System.out.print("Percent:");
        double percent;
        percent = scanner.nextDouble();
        double result;
        result = getPercent(number,percent);
        System.out.print("Result: "+result);
    }

}
