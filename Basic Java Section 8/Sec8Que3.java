//Write a program to find out highest and second highest number in an array

package com.tester;

import java.util.Scanner;

public class Sec8Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
	
		System.out.println("Enter 5 numbers in array ");
		
		 arr[0] = sc.nextInt();
		 arr[1] = sc.nextInt();
		 arr[2] = sc.nextInt();
		 arr[3] = sc.nextInt();
		 arr[4] = sc.nextInt();

		int max1=arr[0];
		int max2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];
			}
		}
		
		System.out.println("First Maximum number is: "+max1+"\n Second Max number is "+max2);
	    sc.close();
	}
	}


