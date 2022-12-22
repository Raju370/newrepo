package com.arrays;

import java.util.Arrays;

public class PrintArrayElementsInReverseOrder {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };

		// create a new array of the size of the existing old array
		int[] b = new int[a.length];

		// create a new array and assign the existing elements traversing from
		// behind(old array) and assign them from the beginning of the new array

		// traversing array elements from the last

		int j = 0;

		System.out.println("***Array **a** Elements in Reverse Order iterationwise");
		for (int i = a.length - 1; i >= 0; i--) {

		//this problem can be achieved by Swapping Technique too try it once
			
			b[j] = a[i];
			j++;

			System.out.println(Arrays.toString(b));

		}//endOfForLoop
		System.out.println();
		System.out.println("***Array **a** Elements in Reverse Order");
		System.out.println(Arrays.toString(b));
	}//endOFMainMetod

}//endOfTheClass