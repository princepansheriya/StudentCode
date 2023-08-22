package com.kn.forloop;

import java.util.Scanner;

//Write a program to calculate the factorial of a given number.
public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();

		System.out.println(factorial(num));

	}

	static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {

			result = i * result;
		}
		return result;
	}

}
