package com.kn.forloop;

import java.util.Scanner;

//Write a program to print the sum of squares of n numbers.
public class PowerCalculator  {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base");
		int base=s.nextInt();
		System.out.println("Enter exponent");
		int exponent=s.nextInt();
		
		System.out.println(name(base,exponent));

	}
	
	public static int name(int a,int b) {
		int result=1;
		
		for(int i=1;i<=b;i++) {
			
			result=result*a;
		}
		return result;
		
		
	}

}
