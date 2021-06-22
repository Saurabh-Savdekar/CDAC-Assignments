package com.tester;

import java.util.Scanner;

public class TestEmp {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	
		System.out.println("Enter the Employee ID ");
		double ID = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the Employee Name ");
		String Name = sc.nextLine();
		
		
		System.out.println("Enter the Employee Department ");
		String Department = sc.nextLine();
		
		
		System.out.println("Enter the Employee Address ");
		String Address = sc.nextLine();
		
		System.out.println("Enter the Employee Salary ");
		double Salary = sc.nextDouble();
		
		

	   	Emp e = new Emp(ID,Name,Department,Address,Salary );
		 e.displayEmpDetails();
		 sc.close();
		
		
		
	}
	}
	

