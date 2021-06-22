//Write a program to calculate the power of any number using recursion

package com.tester;

import java.util.Scanner;

public class Sec9Que4 {
	
	public static int Power(int x,int y) {
		if(y == 0) return 1;
		return (x * Power(x,y-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base x and power y  ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The Power of number is " +Power(x,y));
        sc.close();

	}

}
