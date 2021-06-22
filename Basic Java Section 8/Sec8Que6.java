//Write a Java program to test if an array contains a specific value

package com.tester;

import java.util.Scanner;

public class Sec8Que6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int[] arr = new int[5];
        
    	System.out.println("Enter array of 5 elements ");
    	for(int i = 0 ; i<arr.length; i++) {
             arr[i] = sc.nextInt();
    	}
    	
    	System.out.println("Enter the element which you want to check ");
    	
    	int num= sc.nextInt();
    	
	      for(int i = 0; i<arr.length; i++){
	         if(num == arr[i]){
	            System.out.println("Array contains the given element");
	         }
	            else {
	        	 System.out.println("Array Does not contain the given element");
	         
	            
	        }
	      }
	   }
	

	}


