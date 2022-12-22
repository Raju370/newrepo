package com.test;

import java.util.Scanner;

public class GcdCheck {

	/**
	 * n1, n2 GCD = 1 10 - 1, 2, 5 8 - 1, 2, 4, 8
	 * 
	 * int n1 = 10, n2 = 8;
	 * 
	 * GCD = 1 , 2, 3, 4, 5
	 * 
	 * 2 - 2<10 - 2<8 (10/2 , 8/2)
	 * 
	 * 3 - 3<10 - 3<8 (10/3 , 8/3)
	 * 
	 * 4 - 4<10 - 4<8 (10/4 , 8/4)
	 * 
	 * 5 - 5<10 - 5<8 (10/5, 8/5)
	 * 
	 * @param args
	 */

	int n1, n2;

	private static int gcdCheck(int n1, int n2) {

		int gcd = 1;

		for (int i = 2; i <= n1 && i <= n2; i++) {

			// System.out.println(i);

			if (n1 % i == 0 && n2 % i == 0) {

				// System.out.println(i);

				gcd = i;
			} // End of if loop
		} // End of for Loop

		return gcd;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int x = sc.nextInt();

		System.out.println("Enter the second number");
		int y = sc.nextInt();

		int gcd = gcdCheck(x, y);
		System.out.println("Greatest common divisor of " + x + " and " + y + " is " + gcd);

	}

}
