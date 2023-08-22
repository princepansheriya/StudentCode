package com.kn.forloop;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		printEvenNumbers( n);

	}

	public static void printEvenNumbers(int n) {

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(" "+i);
			}

		}
	}
}
