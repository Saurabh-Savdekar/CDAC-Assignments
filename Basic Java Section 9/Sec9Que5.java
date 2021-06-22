//Write a recursive program to print Fibonacci Series for given number of terms

package com.tester;

import java.util.Scanner;

public class Sec9Que5 {
	
	public static int  FibonacciSeries(int num) {
		if(num == 0){
			return 0;
		}
		if(num == 1 || num == 2){
				return 1;
		}
		return FibonacciSeries(num - 2) + FibonacciSeries(num - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  ");
		int num = sc.nextInt();
		System.out.println("The Fibonacci Series is " );
		
		for(int i = 0; i < num; i++){
			System.out.print(FibonacciSeries(i) +" ");
		}
       
		sc.close();
	}
}

