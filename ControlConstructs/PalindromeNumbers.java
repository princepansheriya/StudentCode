package com.kn.forloop;

import java.util.Scanner;

//You overhear a riddle about palindrome numbers at a party. Intrigued by it, you decide to create a program using a 'for' loop that checks whether a number is a palindrome or not.
//Method Signature:
public class PalindromeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();
		int temp = num;

		System.out.println(isPalindrome(num, temp));

	}

	public static boolean isPalindrome(int num, int temp) {
		int r, sum = 0;
		for (int i = 1; 0 < num; i++) {

			r = num % 10;
			sum = r + 10 * sum;

			num = num / 10;
		}

		if (temp == sum) {
			return true;
		} else {
			return false;
		}

	}

}
