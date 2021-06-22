/*Write a program to calculate the monthly in hand salary of an employee : 
	take input for basic salary,
	HRA is 40% of basic salary,
	PF amount to be deducted is 12% of basic,
	Medical allowance is Rs 1200 per month, 
	Traveling allowance is Rs 800 per month,
	Professional tax to be deducted is Rs 300.
*/

import java.util.Scanner;
public class Sec2Que4{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your basic Salary of month ");
		
		int salary = sc.nextInt();
		
		double HRA = 0.4 * salary;
		double PF = 0.12 * salary;
		int Medical_allowance = 1200;
		int Travelling_allowance = 800;
		int tax = 300;
		
		double Inhand = salary - (HRA + PF + Medical_allowance + Travelling_allowance + tax);
		
		System.out.println("The Inhand Salary is " + Inhand);
		
	}
}