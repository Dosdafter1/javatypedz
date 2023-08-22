package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//task12
public class ArraySort {
    public static void  ascendingSort(int[] unsortedArr) {
        int temp;
        for (int i = 0; i < unsortedArr.length - 1; i++) {
            for (int j = 0; j < unsortedArr.length - i - 1; j++) {
                if (unsortedArr[j] > unsortedArr[j + 1]) {
                    temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j + 1];
                    unsortedArr[j + 1] = temp;
                }
            }
        }
    }

    public static void descendingSort(int[] unsortedArr) {
        int temp;
        for (int i = 0; i < unsortedArr.length - 1; i++) {
            for (int j = 0; j < unsortedArr.length - i - 1; j++) {
                if (unsortedArr[j] < unsortedArr[j + 1]) {
                    temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j + 1];
                    unsortedArr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(boolean type, int[] arr)
    {
        if(type){
            ascendingSort(arr);
        }
        else {
            descendingSort(arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ascending-a | Descending-d:");
        char type;
        type = scanner.nextLine().charAt(0);
        boolean sortType;
        switch (type) {
            case 'a':
                sortType=true;
                break;
            case 'd':
                sortType=false;
                break;
            default:
                System.out.print("Error: incorrect symbol!");
                return;
        }

        int[] arr = new int[10];
        Random random = new Random();
        for(int index=0;index<arr.length;index++) {
            arr[index] = random.nextInt(10);
        }
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));

        selectSort(sortType,arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
