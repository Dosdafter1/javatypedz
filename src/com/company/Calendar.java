package com.company;

import java.util.Scanner;

//task 5
public class Calendar {
    public static String getMonthName(int monthNumber) {
        if(monthNumber==12 || monthNumber<3 && monthNumber>0){
            return "Winter";
        }
        else if(monthNumber<6 && monthNumber>0) {
            return "Spring";
        }
        else if(monthNumber<9 && monthNumber>0) {
            return "Summer";
        }
        else if(monthNumber<12 && monthNumber>0) {
            return "Autumn";
        }
        return "Such a month does not exist!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month:");
        int month;
        month = scanner.nextInt();
        System.out.print(getMonthName(month));
    }
}
