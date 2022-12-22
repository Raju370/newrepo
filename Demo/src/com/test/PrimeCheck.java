package com.test;

import java.util.Scanner;

public class PrimeCheck {

	/**
	 * Prime number - if it has 1 and itself as factors (eg: 1,3,5,7,11,13....)
	 * Composite numbers - if a number has more than two factors then composite.
	 * 
	 * int n =5
	 * Iteration  ifcondition   result
	 * i=1			5%1==0		1
	 * i=2 			5%2!=0		1
	 * i=3 		    5%2!=0		1
	 * i=4 			5%2!=0		1
	 * i=5 			5%2!=0		2  (1 @i=1 + 1 @i=5)
	 * @param args
	 *  
	 */
    
	private static boolean primeCheck(int n) {
		int count = 0;
		boolean isPrimeBool = true;
		
		//since 1 is a factor of every number. to reduce one iteration we start from i from 2.
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0)
              count++; // end of if loop
		} // end of for loop

		if(count > 0)
			isPrimeBool = false;
			
		return isPrimeBool;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number to check for prime");

		int num = sc.nextInt();

		boolean isPrimeBoolean = primeCheck(num);
		
		if (isPrimeBoolean == true)
			
			System.out.println("is a prime number");
		
		else
			System.out.println("is not a prime number");
	}

}
