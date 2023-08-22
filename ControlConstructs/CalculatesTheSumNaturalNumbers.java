package com.kn.forloop;

import java.util.Scanner;


public class CalculatesTheSumNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();
		System.out.println(calculateSum(num));

	}

	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum = i + sum;
		}
		return sum;
	}
}
