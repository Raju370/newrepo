package com.test;

import java.util.Scanner;

public class MultiplicationTable {
	/**
	 * 5X1=5
	 * 5X2=10
	 * .....
	 * .....
	 * 5X10=50
	 * 
	 * 
	 */
	
	 public static void main(String[] args) {
		 		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n = sc.nextInt();
						 
		for(int i=1; i<=10; i++) {
						
		System.out.println(n+" * "+i+" = "+n*i);
				
		}//EOL-for 
   
		 
		 
	}

}

