package com.kn.forloop;

import java.util.Scanner;

//Write a program to print a given number table.
public class NumberTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();

		table(num);

	}
	static void table(int num) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + "x" + i + "=" + num * i);

		}
	}
	

}
