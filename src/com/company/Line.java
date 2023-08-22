package com.company;

import java.util.Scanner;
//task11
public class Line {
    public static void drawHorizontalLine(int length, char symbol) {
        for(int index=0;index<length;index++){
            System.out.print(symbol);
        }
    }

    public static void drawVerticalLine(int length, char symbol) {
        for(int index=0;index<length;index++){
            System.out.println(symbol);
        }
    }

    public static void selectLine(boolean type, int length, char symbol) {
        if(length<1){
            System.out.print("Error: length too small!");
            return;
        }
        if(type) {
            drawHorizontalLine(length,symbol);
        }
        else {
            drawVerticalLine(length,symbol);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Horizontal-h | Vertical-v:");
        char type;
        type = scanner.nextLine().charAt(0);
        boolean lineType;
        switch (type) {
            case 'h':
                lineType=true;
                break;
            case 'v':
                lineType=false;
                break;
            default:
                System.out.print("Error: incorrect symbol!");
                return;
        }

        System.out.print("Symbol:");
        char symbol;
        symbol = scanner.nextLine().charAt(0);

        System.out.print("Length:");
        int length;
        length = scanner.nextInt();

        selectLine(lineType,length,symbol);
    }
}
