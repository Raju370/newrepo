package com.test;

import java.util.Scanner;

/**
 * 			*
 * 			**
 * 			***
 * 			****
 * 			*****
 * 
 * left angle triangle
 * 
 * i  .....> for rows
 * j.......> for columns
 * 
 * 
 * 
 * 
 * 
 * @author LENOVO
 *
 */
public class NumberPattern {

	private static void printPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			//for(int j = 1; j <= i; j++) {
				
			for(int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
				
					
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number for which to obtain a pattern :");
		
		int n = sc.nextInt();
		
		printPattern(n);

	}

}
