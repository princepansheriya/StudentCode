package com.kn.array;

import java.util.Scanner;

/**
 * This program counts the frequency of specified numbers in an array.
 * It takes input for the array size, elements, and the numbers to find,
 * and then displays the frequency of those numbers in the array.
 */
public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");

        int[] arr = new int[s.nextInt()];
        int[] brr = new int[1000000];

        // Initialize array
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("How many numbers you want to find in the array");
        int[] crr = new int[s.nextInt()];
        System.out.println("Enter values");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            brr[value] = brr[value] + 1;
        }

        for (int i = 0; i < crr.length; i++) {
            int value = crr[i];
            System.out.println(crr[i] + " is in the array " + brr[value] + " times");
        }
    }
}
