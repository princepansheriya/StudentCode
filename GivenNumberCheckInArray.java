package com.kn.array;

import java.util.Scanner;

public class GivenNumberCheckInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number for check in array");
		int num = s.nextInt();
		int[] arr = { 1, 45, 65, 83, 90, 11, 5 };

		boolean flag = chekArray(arr, num);
		if (flag == true) {
			System.out.println(num+" is available in array");
		} else {
			System.out.println( num+" is not available in array");
		}
	}

	public static boolean chekArray(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {

				return true;
			}

		}
		return false;

	}

}
