package com.test;

import java.util.Scanner;

/**
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 */
public class NumberPattern2 {

	
	private static void printPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.println(j);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		printPattern(n);
		
	}

}
