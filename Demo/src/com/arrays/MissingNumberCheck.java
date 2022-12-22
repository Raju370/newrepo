package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberCheck {
	/*
	 * in order to find the missing number/element from the array. misingNumber =
	 * sumOfAllNaturalNumbers - sumOfArray sumOfAll = (n*(n+1))/2
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("User please enter the size of the array you desire to have  :");
		int n = sc.nextInt();

		/**
		 * create a new array by using new java operator with the user entered size (i.e
		 * array a is created with user entered size n
		 */
		int[] a = new int[n];// array creation with new operator

		System.out.println();
		System.out.println("length is : " + a.length);// size of the array is obtained

		/*
		 * initialize the array elements by passing the elements from the keyboard for
		 * traversing purpose of array i need a for loop User please enter (n-1)
		 * elements. then we can find that missing element. if we enter all the elements
		 * into our array we cannot find missing element
		 * 
		 */ 
		for (int i = 0; i < a.length - 1; i++) {// a.length-1 ....> allowing user to enter length-1 elements so that
													// my program can find that missing element.
			System.out.println("user enters the elements from the keyboard till the size-1 elements:	"); 
		
			a[i] = sc.nextInt();
		} // endOfForLoop

		System.out.println("User below is the array you entered and there is one element missing from the group");
		System.out.println(Arrays.toString(a));

		// obtaining the sum of the n natural numbers
		int sumOfAllNumbers = (n * (n + 1)) / 2;

		int sumOfArr = 0;

		//for (int i = 0; i < a.length - 1; i++) {// here i am allowing the loop to traverse until length minus 1 times as
												// the elements in the array entered is length minus 1
			// Obtaining sum of all the elements in the array
		
		for (int i = 0; i < a.length - 1; i++) {	
		
		sumOfArr = sumOfArr + a[i];

		}
		// toFindMissingNumber below is the formula
		int missingNumber = sumOfAllNumbers - sumOfArr;

		System.out.println();
		System.out.println("user this is the missing element from the group of array **a**");
		System.out.println(missingNumber);

	}

}
