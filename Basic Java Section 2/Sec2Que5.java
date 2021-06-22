//Write a Java program to print the area and perimeter of a rectangle. Take required input using Scanner

import java.util.Scanner;
public class Sec2Que5{
   public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Length of Rectangle ");	
         double length = sc.nextDouble();     

      System.out.println("Enter the Width of Rectangle ");	  
	     double width = sc.nextDouble(); 
		 
     double Perimeter = 2*(length + width);
	 double Area = length * width;
	 
	  System.out.println("The Perimeter of rectangle is " + Perimeter);	 
	 System.out.println("The Area of rectangle is " + Area);	  
   }
}