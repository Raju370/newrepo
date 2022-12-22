package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayValues {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("what is the size of the array you want enter the number :");
		int n = sc.nextInt();

		// array declaring with n as its size
		String[] str = new String[n];

		//array initialization
		for (int i = 0; i < str.length; i++) {

			System.out.println("enter the Name :");
			str[i] = sc.nextLine();
		} // end of the for Loop

		System.out.println("length of the String :" + str.length);
		System.out.println(Arrays.toString(str));
		
	}
	
}
