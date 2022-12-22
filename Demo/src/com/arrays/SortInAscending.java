package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortInAscending {

	public static void main(String[] args) {

		System.out.println(
				"=Creating Scanner class- passing inputs through keyboard-Array created with new operator - initialised array with elements :");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the size of the array you expecting just type the number :");
		int n = sc.nextInt();

		int[] a = new int[n]; // array class object with reference variable a is created using new operator
								// with array size as n
		System.out.println();
		System.out.println("length of the array :" + a.length);// length of the array
		System.out.println();

		for (int i = 0; i < a.length; i++) { // a.length .....> will find no of elements in the array

			System.out.print("just type the Number :");
			a[i] = sc.nextInt();
		} // end1OfForLoop

		System.out.println();
		System.out.println("you entered below values");
		System.out.println();
		System.out.println(Arrays.toString(a)); // printing the values entered by the user choice to the console .
		System.out.println();

		System.out.println("======to find Minimum and Maximum elements from the given array=====");

		// int[] a = [18, 14, 13, 10, 8];

		int max = a[0];

		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i]; // re-initializing max with a new value
			}

			if (a[i] < min) {

				min = a[i];// re-initializing min with a new value
			}
		}

		System.out.println("max :" + max);// prints max element from the array
		System.out.println("min :" + min);// prints min element from the array
		System.out.println();

		System.out.println("===to sort array elements in ascending order====");
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
					System.out.println(Arrays.toString(a));
					}//endOfIf
			}//end of inner forLoop
			
			
		}//endOf outerForLoop

		System.out.println(Arrays.toString(a));
		System.out.println();
		
		
		
	}

}
