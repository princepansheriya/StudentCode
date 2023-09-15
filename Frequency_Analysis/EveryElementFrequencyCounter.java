package com.kn.array;

/**
 * This program counts the frequency of each element in an integer array
 * and displays the results, indicating how many times each element appears.
 */
public class EveryElementFrequencyCounter {

    public static void main(String[] args) {

        int[] arr = { 10, 101, 20, 10, 30, 40 };

        int max = Integer.MIN_VALUE;
        for (int m : arr) {
            if (m > max) {
                max = m;
            }
        }
        int[] brr = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            brr[num] = brr[num] + 1;
        }

        for (int i = 0; i < brr.length; i++) {
            if (brr[i] > 0) {
                System.out.println(i + " is in the array " + brr[i] + " times.");
            }
        }
    }
}
