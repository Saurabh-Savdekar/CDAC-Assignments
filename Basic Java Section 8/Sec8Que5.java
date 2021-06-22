//Write a program to concatenate two arrays (merge two array to new one)?
//    a[] = {1,2,3}
//	b[] = {4,5}
//	c[] = {1,2,3,4,5}


package com.tester;

import java.util.Arrays;

public class Sec8Que5 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		int[] b = {4,5};   
		
		int c = a.length;   
		
		int d = b.length; 
		
		int[] result = new int[c + d]; 
		
		int pos = 0;  
		for (int element : a) 
		{  
		result[pos] = element;  
		pos++;             
		}  
		for (int element : b) 
		{  
		result[pos] = element;  
		pos++;  
		}  
		System.out.println(Arrays.toString(result));   
		}  

}
