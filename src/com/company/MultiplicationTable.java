package com.company;

import java.util.Scanner;

//task 8
public class MultiplicationTable {
    public static void showMultiplicationTable(int start, int finish) {
        int first;
        int last;
        if(start>finish)
        {
            first = finish;
            last = start;
        }
        else {
            first = start;
            last = finish;
        }
        for(int currentNumber=first; currentNumber<=last; currentNumber++) {
            for(int number=1; number<=10; number++) {
                System.out.print(currentNumber+"*"+number+"="+currentNumber*number+" ");
            }
            System.out.println();
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

        showMultiplicationTable(start,finish);
    }
}
