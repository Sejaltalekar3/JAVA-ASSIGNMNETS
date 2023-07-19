package com.kodnest.arraysmethods;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Original array: ");
        printArray(array);

        // Reverse the array
        int[] reversedArray = reverseArray(array);

        System.out.println("Reversed array: ");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }

        return reversedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
