package com.company;

import java.util.Scanner;

//task 7
public class Odds {
    public static void showOddNumbers(int start, int finish) {
        double first;
        double last;
        if(start>finish)
        {
            first = finish;
            last = start;
        }
        else {
            first = start;
            last = finish;
        }
        for(double currentNumber=first;currentNumber<=last;currentNumber++) {
            if(currentNumber%2!=0) {

                System.out.print(Math.round(currentNumber)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start:");
        int start;
        start = scanner.nextInt();

        System.out.print("Finish:");
        int finish;
        finish = scanner.nextInt();

        showOddNumbers(start,finish);
    }

}
