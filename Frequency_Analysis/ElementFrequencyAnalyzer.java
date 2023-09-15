package com.kn.array;

/**
 * This program analyzes the frequency of elements in an integer array and
 * identifies the highest and lowest frequency elements.
 */
public class ElementFrequencyAnalyzer {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4, 2};
        int p = Integer.MIN_VALUE;

        for (int m : arr) {
            if (p < m) {
                p = m;
            }
        }

        int[] brr = new int[p + 1];

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            brr[n] = brr[n] + 1;
        }

        int m = Integer.MIN_VALUE, max = 0;
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] > m) {
                m = brr[i];
                max = i;
            }
        }

        int mn = Integer.MAX_VALUE, min = 0;
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] < mn && brr[i] > 0) {
                mn = brr[i];
                min = i;
            }
        }

        System.out.println("highest frequency element = " + max);
        System.out.println("lowest frequency element = " + min);
    }
}
