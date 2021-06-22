// Write a Java program to find the index of an array element

package com.tester;
import java.util.*;

public class Sec8Que7 {

	 public static int findIndex(int arr[], int i)
	    {
	 
	      
	        if (arr == null) {
	            return -1;
	        }
	 
	  
	        int len = arr.length;
	        int j = 0;
	 
	       
	        while (j < len) {
	 
	         
	            if (arr[j] == i) {
	                return i;
	            }
	            else {
	                i = i + 1;
	            }
	        }
	        return -1;
	    }
	 

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	    	int[] arr = new int[5];
	        
	    	System.out.println("Enter array of 5 elements ");
	    	
	    	for(int i = 0 ; i<arr.length; i++) {
	             arr[i] = sc.nextInt();
	    	}
	      
	    	for(int i = 0; i<arr.length; i++) {
	    		
	    		System.out.println("Index position of " +i+ "is: "
                        + findIndex(arr, i));
	    		
	    	}
	      
	    }
	}

