//Write a java program to print first 10 natural number using recursion

package com.tester;

public class Sec9Que1 {
	
	static void RecNatural(int num) {
		 if(num<=10)
		    {
		    	 System.out.print(" "+num+" ");
		    	 RecNatural(num+1);
		    }	      
	  
	}
	      
	
	public static void main(String[] args) {
	int num = 1;
		System.out.println("First 10 Natural no are "); 
			RecNatural(num);

	}

}
