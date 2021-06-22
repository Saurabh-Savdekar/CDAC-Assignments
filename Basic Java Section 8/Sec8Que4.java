//Write a Java program to copy an array to another by iterating the array



package com.tester;

import java.util.Scanner;

public class Sec8Que4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
	
		System.out.println("Enter 5 numbers in array ");
		
		 arr[0] = sc.nextInt();
		 arr[1] = sc.nextInt();
		 arr[2] = sc.nextInt();
		 arr[3] = sc.nextInt();
		 arr[4] = sc.nextInt();
		 

			System.out.println("First  array ");
			
		 int i = 0;
		 while(i < arr.length) {
			 System.out.println( +arr[i]);
			 i++;
			}
		 
		 int arr2[] = new int[ arr.length];

			System.out.println("Second array ");
			
		 int j = 0;
		 while(j <  arr.length) {
			 System.out.println( +arr2[j]);
			 j++;
			}
		 
		 System.out.println("Second array after Copying from first ");
		 
		for(int a = 0; a < arr.length; a++) {
			arr2[a] = arr[a];
		}
		
		 int k = 0;
		 while(k < arr2.length) {
			 System.out.println( +arr2[k]);
			 k++;
			}
		 
	}
        
}
