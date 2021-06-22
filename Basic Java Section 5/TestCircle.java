package com.tester;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Radius of Circle : ");
			double rad = sc.nextDouble();
			sc.nextLine();
			
			
		   	Circle c = new Circle(rad);
			 c.calArea();
			 c.calPerimeter();
			 sc.close();
		}
		}
		
