package com.kn.forloop;

import java.util.Scanner;

//Write a program to print the Fibonacci series up to n terms.
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num=s.nextInt();

		fibonacci(num);

	}
	
	static void fibonacci(int num) {
		int firstNumber = 0, secondNumber = 1, thierdNumber = 0;
		System.out.print(firstNumber);

		for (int i = 3; i <= num; i++) {
			firstNumber = secondNumber;
			secondNumber = thierdNumber;
			thierdNumber = firstNumber + secondNumber;
			System.err.print(" "+thierdNumber);

		}
		
	}

}
