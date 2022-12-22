package com.arrays;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };

		// array c creates with new operator with the size equal to sum of the size of
		// the array a & array b.
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {

			// assigning the values of the array a to array c starting from the index 0
			c[i] = a[i]; // c[] = {1,2,3,4,0,0,0,0}

		}
		System.out.println("You added only array **a** elements into a new array **c** & array c looks like below");
		System.out.print(Arrays.toString(c));// {1,2,3,4,0,0,0,0}
		System.out.println();

		System.out.println();
		System.out.println("trying to print the iteration wise how the elements are added to the array **c**");
		for (int j = 0; j < b.length; j++) {

			// array b elements added to array c from 5th index since a.length is 4
			c[j + a.length] = b[j];// {1, 2, 3, 4, 5, 6, 7, 8}

			System.out.print(Arrays.toString(c));
			System.out.println();

		}
		System.out.println();
		System.out.println(
				"You added array **b** elements as well into array **c** which already holds array **a** elements");

		System.out.println("final outcome of array **c** after adding array **a** & array **b**");
		System.out.print(Arrays.toString(c));// 1, 2, 3, 4, 5, 6, 7, 8

	}

}
