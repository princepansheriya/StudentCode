package com.kn.arraysorting;

public class SelectionSorting {

    public static void main(String[] args) {

        // Initialize the unsorted array
        int[] arr = { 1, 9, 3, 2, 1, 5, 4, 9, 11 };

        // Print the original unsorted array
        System.out.println("Original Array:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // Call the sortArray method to sort the array
        int[] sortArr = sortArray(arr);

        // Print the sorted array
        System.out.println("\nAfter sorting array:");
        for (int m : sortArr) {
            System.out.print(m + " ");
        }
    }

    // This method implements the Selection Sort algorithm to sort an integer array
    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume the current element is the minimum

            // Find the index of the minimum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // Update the index of the minimum element
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr; // Return the sorted array
    }
}
