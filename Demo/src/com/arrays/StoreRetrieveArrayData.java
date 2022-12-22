package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StoreRetrieveArrayData {

	/**
	 *dataType[] variableName;  ||array Declaration
	 *
	 *int[] a = new int[3];     ||array creation with its size as 3
	 * 
	 */
	
	public static void main(String[] args) {
		
		//taking the input from the keyboard
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many numbers you want to enter :");
		int cnt = Integer.parseInt(sc.nextLine());
		
		//create a new array with size cnt
		int[] num = new int[cnt];
		
		//Initialize the array 
		
		for(int i = 0; i < num.length; i++) {
			
			System.out.println("enter the number :");
			
			num[i] = sc.nextInt();
						
		}// endOfForLoop
		
		System.out.println("You stored below values :");
		
		System.out.println(Arrays.toString(i));
		
		
		

	}

}
