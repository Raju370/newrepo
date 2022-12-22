package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrEqualToInput {

	public static void main(String[] args) {
    System.out.println("====Read a number from Keyboard - & identify array element pairs whose sum = to given number=====");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the user desired size of the array :");
    int n = sc.nextInt();
    
    int[] a = new int[n];//array created with some size of n as its length
    
    System.out.println("length of array :" +a.length);
    
    //array initialized
    for(int i = 0; i < a.length; i++) {
    	
    	System.out.println("enter the number :");
    	a[i] = sc.nextInt();
    	
    }
    
    System.out.println("you entered below values :");
    System.out.println();
    System.out.println(Arrays.toString(a));
    
    System.out.println("enter one number toverify if any pair from the array make the input number:");
     int k = sc.nextInt();
    
		for(int i = 0; i < a.length; i++ ) {
			
			for(int j = i + 1;j< a.length; j++) {
				
				if(a[i] + a[j] == k) {
					System.out.println("the given two pairs sum is equal to the user entered number :" +a[i]+"," +a[j]);
				}else {
				System.out.println("pair sum is not equal to user number");
				
				}//endOfElseBlock
			}//endOfInnerForLoop
		}//endOfOuterForLoop
	}
}