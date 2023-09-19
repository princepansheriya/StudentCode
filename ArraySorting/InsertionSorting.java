package com.kn.arraysorting;

public class InsertionSorting {

	public static void main(String[] args) {

		// Initialize the unsorted array
		int[] arr = { 1,9,3, 2, 1, 5, 4,9,11 };

		// Print the original unsorted array
		System.out.println("Original Array:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		// Sort the array using insertion sort
		int[] sortArr = sortArray(arr);

		// Print the sorted array
		System.out.println("\nAfter sorting array");
		for (int b : sortArr) {
			System.out.print(b + " ");
		}
		
	}
	public static int[] sortArray(int[] arr) {

		for(int i=1;i<arr.length;i++) {
			
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			}
		return arr;
		}
		

	

}
