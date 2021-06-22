//Write a program to take "name" from user using Scanner and greet as shown below-
//>> Enter your name : Shakir
//Hello Shakir , Welcome to Java World.

import java.util.Scanner;
public class Sec2Que1 {
    
	public static void main(String args[]){
	      
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter Your Name : ");
		  
		  String name = sc.next();
		  
		  System.out.print("Hello " + name); 
		  System.out.println(" Welcome to Java World ");
	
	
	}



}