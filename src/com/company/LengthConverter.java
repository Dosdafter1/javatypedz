package com.company;

import java.util.Scanner;
//task 6
public class LengthConverter {
    public static double converter(double meters, char lengthType) {
        if(meters<0) {
            return 0x00;
        }
        switch (lengthType) {
            case 'i':
                return meters*39.370D;
            case 'm':
                return meters*0.00062137D;
            case 'y':
                return meters*1.0936D;
            default:
                return 0x00;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Miles-m | Yards-y | Inch-i:");
        char type;
        type = scanner.nextLine().charAt(0);

        System.out.print("Meters:");
        double meters;
        meters = scanner.nextDouble();

        double result;
        result = converter(meters,type);
        if(result==0x00) {
            System.out.print("Ooops...");
        }
        else {
            System.out.print("Result: "+result);
        }
    }
}
