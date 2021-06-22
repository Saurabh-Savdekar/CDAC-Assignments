//Write a java program to calculate the sum of numbers from 1 to N using recursion

package com.tester;
import java.util.Scanner;

public class Sec9Que2 {
	
	public static int Sum(int num) {
		 if(num == 0) return 1;
		    return num + Sum(num-1);
		  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		//int num = 10;
		int y = Sum(num);
		
		System.out.println("The sum of numbers is "+y);
		

	}

}
