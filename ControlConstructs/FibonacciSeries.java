package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = s.nextInt();

		fibonacci(num);
	}
	
	static void fibonacci(int num) {
		int firstNumber = 0, secondNumber = 1, thirdNumber = 0;
		System.out.print(firstNumber + " " + secondNumber);

		for (int i = 2; i < num; i++) {
			thirdNumber = firstNumber + secondNumber;
			System.out.print(" " + thirdNumber);

			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}
}
