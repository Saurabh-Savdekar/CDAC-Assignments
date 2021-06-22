//Write a java program to take 5 numbers using Scanner and print the average ?

// >> Enter 5 numbers : 1 2 3 4 5
// Average = 3

// >> Enter 5 numbers : 2 3 5 7 9
// Average = 5.2



import java.util.Scanner;
public class Sec2Que2 {
       
	   public static void main(String args[]){
	   
	     Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number 1: ");
		 
		 float a = sc.nextFloat();
		 
		 System.out.println("Enter the Number 2: ");
		 
		 float b = sc.nextFloat();
		 
		 System.out.println("Enter the Number 3: ");
		 
		 float c = sc.nextFloat();
		 
		 System.out.println("Enter the Number 4: ");
		 
		 float d = sc.nextFloat();
		 
		 System.out.println("Enter the Number 5: ");
		 
		 float e = sc.nextFloat();
		 
		 float avg = (a + b + c + d + e)/5;
		 
		 System.out.println("The average of the numbers is " + avg);
		 
		 
	   
	   
	   
	   
	   }

}