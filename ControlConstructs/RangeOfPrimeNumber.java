package com.kn.forloop;

import java.util.Scanner;

public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();
		range(num);
	}

	static void range(int num) {
		
		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}

		}

	}

}
