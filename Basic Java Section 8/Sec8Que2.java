//Write a program to reverse an array of elements

package com.tester;
import java.util.Scanner;

public class Sec8Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
	
		System.out.println("Enter 5 numbers in array ");
		
		 arr[0] = sc.nextInt();
		 arr[1] = sc.nextInt();
		 arr[2] = sc.nextInt();
		 arr[3] = sc.nextInt();
		 arr[4] = sc.nextInt();
		 
			System.out.println("Original Array ");
			
		 int i = 0;
		 while(i < arr.length) {
		 System.out.println( +arr[i]);
		 i++;
		}
		
		 System.out.println("Array in reverse order  ");
		 
		
		 for(int j=arr.length-1; j >= 0; j--) {
			 System.out.println( +arr[j]);
		 }
		 

	}

}
