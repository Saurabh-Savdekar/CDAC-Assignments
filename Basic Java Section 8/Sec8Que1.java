//Write a program to calculate average of numbers stored in an array?




package com.tester;
import java.util.Scanner;
public class Sec8Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
	
		System.out.println("Enter 5 numbers in array ");
		
		 arr[0] = sc.nextInt();
		 arr[1] = sc.nextInt();
		 arr[2] = sc.nextInt();
		 arr[3] = sc.nextInt();
		 arr[4] = sc.nextInt();
		 
		 double sum = 0.0;
		 
		 for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i]; 
		 }
		 
		
		 
	     double avg = (sum/5.0);
				 
		 System.out.println("The average is :"+avg);
		
		sc.close();
		
		
		

	}

}
