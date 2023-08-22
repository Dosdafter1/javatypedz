package com.company;

import java.util.Scanner;

//task 4
public class DotfuscatorNumber {
    public static int dotfuscator(int number) {
        String numberString = ""+number;
        if(numberString.length() != 6){
            return -1;
        }
        String resultString = "" + numberString.charAt(5)
                            + numberString.charAt(4)
                            + numberString.charAt(3)
                            + numberString.charAt(2)
                            + numberString.charAt(1)
                            + numberString.charAt(0);

        return Integer.parseInt(resultString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number;
        number = scanner.nextInt();
        int result = dotfuscator(number);
        if(result==-1){
            System.out.print("The number must consist of six digits!");
        }
        else {
            System.out.print("Result:" + result);
        }
    }
}
