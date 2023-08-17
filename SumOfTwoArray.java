package com.kn.array;

import java.util.Scanner;

public class SumOfTwoArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the array size");

        // Create and initialize 1D array 'arr'
        int[] arr = new int[s.nextInt()];
        System.out.println("Enter the array 1 values");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " value = ");
            arr[i] = s.nextInt();
        }

        // Create and initialize 1D array 'brr'
        int[] brr = new int[arr.length];
        System.out.println("Enter the array 2 values");
        for (int i = 0; i < brr.length; i++) {
            System.out.print((i + 1) + " value = ");
            brr[i] = s.nextInt();
        }

        // This method call will calculate and display the sum of two arrays
        sumOfTwoArray(arr, brr);

        // This method call will calculate and display the multiplication of two arrays
        multiplicationOfTwoArray(arr, brr);
    }

    // Method to calculate and display the sum of two arrays
    private static void sumOfTwoArray(int arr[], int brr[]) {
        int[] crr = new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i] = arr[i] + brr[i];
            System.out.println("Sum of 2 arrays = " + crr[i]);
        }
    }

    // Method to calculate and display the multiplication of two arrays
    private static void multiplicationOfTwoArray(int[] arr, int[] brr) {
        int[] crr = new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i] = arr[i] * brr[i];
            System.out.println("Multiplication of 2 arrays = " + crr[i]);
        }
    }

}
