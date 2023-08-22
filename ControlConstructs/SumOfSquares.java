package com.kn.forloop;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		System.out.println(sumOfSquares(n));
		

	}

	public static int sumOfSquares(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum = (i * i) + sum;

		}
		return sum;

	}
}
