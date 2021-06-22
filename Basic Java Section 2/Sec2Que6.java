//Write a Java program to print the area and perimeter of a circle. Take required input using Scanner?

import java.util.Scanner;
public class Sec2Que6{
   public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

      System.out.println("Enter the radius of Circle ");	
         double radius = sc.nextDouble();     

     double Perimeter = 2 * 3.14 * radius;
	 double Area = 3.14 * radius * radius;
	 
	  System.out.println("The Perimeter of Circle is " + Perimeter);	 
	  System.out.println("The Area of Circle is " + Area);	  
   }
}