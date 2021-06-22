//Write a program to calculate the product of two integers using recursion

package com.tester;

import java.util.Scanner;

public class Sec9Que3 {
	
	public static int Product(int x , int y) {
		if(y == 0) return 0;
		return x + Product(x,y-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The Product of two numbers is " +Product(x,y));
        sc.close();
	}

}
