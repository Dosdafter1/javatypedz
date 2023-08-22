package com.company;

import java.util.Scanner;

//task 3
public class CreateNumber {

    public static int createNumber(int firstNum, int secondNum, int lastNum) {
        if(firstNum > 9 && firstNum > 0 || secondNum > 9  && secondNum >= 0  || lastNum > 9 && lastNum >= 0 ) {
            return -1;
        }
        return (firstNum * 100) + (secondNum * 10) + lastNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First digit:");
        int firstNum;
        firstNum = scanner.nextInt();

        System.out.print("Second digit:");
        int secondNum;
        secondNum = scanner.nextInt();

        System.out.print("Last digit:");
        int lastNum;
        lastNum = scanner.nextInt();

        int result = createNumber(firstNum, secondNum, lastNum);
        if(result == -1) {
            System.out.print("Oops..");
        }
        else {
            System.out.print("Final number:" + result);
        }

    }
}
