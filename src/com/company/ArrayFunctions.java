package com.company;

import java.util.Arrays;
import java.util.Random;
//task9 & task10
public class ArrayFunctions {

    //task9
    public static int min(int[] arr) {
        int min=arr[0];
        for (int currentNum:arr) {
            if(currentNum<min){
                min=currentNum;
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max=arr[0];
        for (int currentNum:arr) {

            if(currentNum>max){
                max=currentNum;
            }
        }

        return max;
    }

    public  static int getCountOfNegativeElements(int[] arr) {
        int count=0;
        for (int currentNumber:arr) {

            if(currentNumber<0){
                ++count;
            }

        }
        return count;
    }

    public  static int getCountOfPositiveElements(int[] arr) {
        int count = 0;
        for (int currentNumber:arr) {

            if(currentNumber>0){
                ++count;
            }

        }
        return count;
    }

    public  static int getCountOfNullsElements(int[] arr) {
        int count = 0;
        for (int currentNumber:arr) {

            if(currentNumber==0){
                ++count;
            }

        }
        return count;
    }

    //task10
    public  static int getCountOfOddElements(int[] arr) {
        int count=0;
        for (double currentNumber:arr) {

            if(currentNumber%2!=0){
                ++count;
            }

        }
        return count;
    }

    public  static int getCountOfPairElements(int[] arr) {
        int count = 0;
        for (double currentNumber:arr) {

            if(currentNumber%2==0){
                ++count;
            }

        }
        return count;
    }
    public static int[] getPairElementsArray(int[] arr){
        int size = getCountOfPairElements(arr);
        int[] result = new int[size];
        int resultIndex=0;
        for(double currentNumber:arr) {
            if(currentNumber%2==0) {
                result[resultIndex]=(int)currentNumber;
                ++resultIndex;
            }
        }

        return result;
    }

    public static int[] getOddElementsArray(int[] arr){
        int size = getCountOfOddElements(arr);
        int[] result = new int[size];
        int resultIndex=0;
        for(double currentNumber:arr) {
            if(currentNumber%2!=0) {
                result[resultIndex]=(int)currentNumber;
                ++resultIndex;
            }
        }

        return result;
    }

    public static int[] getPositiveElementsArray(int[] arr){
        int size = getCountOfPositiveElements(arr);
        int[] result = new int[size];
        int resultIndex=0;
        for(int currentNumber:arr) {
            if(currentNumber>0) {
                result[resultIndex]=currentNumber;
                ++resultIndex;
            }
        }

        return result;
    }

    public static int[] getNegativeElementsArray(int[] arr){
        int size = getCountOfNegativeElements(arr);
        int[] result = new int[size];
        int resultIndex=0;
        for(int currentNumber:arr) {
            if(currentNumber<0) {
                result[resultIndex]=currentNumber;
                ++resultIndex;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int lowerBound = -10;
        int upperBound = 10;
        for(int index=0;index<arr.length;index++) {
            arr[index] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
        System.out.println("Task 9");
        System.out.println("Min:"+min(arr));
        System.out.println("Max:"+min(arr));
        System.out.println("Negative elements:"+getCountOfNegativeElements(arr));
        System.out.println("Positive elements:"+getCountOfPositiveElements(arr));
        System.out.println("Null elements:"+getCountOfNullsElements(arr));

        System.out.println("Task 10");
        System.out.println("Pair elements:");
        System.out.println(Arrays.toString(getPairElementsArray(arr)));
        System.out.println("Odd elements:");
        System.out.println(Arrays.toString(getOddElementsArray(arr)));
        System.out.println("Negative elements:");
        System.out.println(Arrays.toString(getNegativeElementsArray(arr)));
        System.out.println("Positive elements:");
        System.out.println(Arrays.toString(getPositiveElementsArray(arr)));
    }
}
