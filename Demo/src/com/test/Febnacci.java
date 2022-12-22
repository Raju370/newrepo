package com.test;

import java.util.Scanner;

public class Febnacci {

	/**
	 * n=5
	 * 
	 * #1 a = 0; b =1 - c= a+b = 1
	 * 
	 * #2 a=b, b=c (a =1, b=1) - c= a+b = 2
	 *
	 * #3 a=b, b=c (a =1, b=2) - c= a+b = 3
	 * 
	 * #4 a=b, b=c (a =2, b=3) - c= a+b = 5
	 * 
	 * #5 a=b, b=c (a =3, b=5) - c= a+b = 8
	 * 
	 * @param args
	 */

	private static void febnac(int n) {

		int a = 0; // firstNumber
		int b = 1; // seondNumber
		int c; // nextNumber (firstNumber + seondNumber)

		System.out.println(a + "\n" + b);

		for (int i = 3; i <= n; i++) {

			c = a + b;
			System.out.println(c);

			// Swapping a value with b and b value with c
			a = b; // a = 1 //firstNumber
			b = c; // b = 1 //secondNumber

		} // end for loop

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for which you need febnocci :");
		int num = sc.nextInt();

		febnac(num);

	}

}
