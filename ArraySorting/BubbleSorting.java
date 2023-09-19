package com.kn.arraysorting;

public class BubbleSorting {

    public static void main(String[] args) {

        // Initialize the unsorted array
        int[] arr = { 1, 9, 3, 2, 1, 5, 4, 9, 11 };

        // Print the original unsorted array
        System.out.println("Original Array:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // Call the sortingArray method to sort the array
        int[] sortArr = sortingArray(arr);

        // Print the sorted array
        System.out.println("\nAfter sorting array:");
        for (int m : sortArr) {
            System.out.print(m + " ");
        }
    }

    // This method implements the Bubble Sort algorithm to sort an integer array
    public static int[] sortingArray(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    result = false;
                }
            }

            // If no swaps were made in this pass, the array is already sorted
            if (result) {
                break;
            }
        }

        return arr;
    }
}
