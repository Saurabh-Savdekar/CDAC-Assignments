//Write a program to Sort an array in ascending order? [Notes : Arrays.sort()]

package com.tester;
import java.util.Scanner;

public class Sec8Que11 {
	

	

	    public static void main(String args[]){
	        Scanner scan = new Scanner(System.in);
//	        System.out.println("Enter size of array :");
//	        int size = scan.nextInt();
	        int num[] = new int[5];
	        for(int i =0;i<num.length;i++){
	            num[i]= scan.nextInt();
	        }
	        System.out.println("Before sorting....");
	        for(int i =0;i<num.length;i++){
	            System.out.print("\t"+num[i]);
	        }

	        System.out.println("\nAfter sorting....");
	        //int high=num[0];
	        for(int i =0;i<num.length;i++){
	           for(int j=i;j< num.length;j++){
	               if (num[i]>num[j]){
	                   int temp;
	                   temp = num[i];
	                   num[i]=num[j];
	                   num[j]=temp;
	               }

	           }
	            System.out.print("\t"+ num[i]);
	        }

	    }

	}


