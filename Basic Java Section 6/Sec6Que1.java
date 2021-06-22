package com.tester;
import java.util.Scanner;

public class Sec6Que1 {
	
	
	public static void main(String args[])
	{
	 int count1=0,count2=0,count3=0,count4=0;
	 int sum1=0,sum2=0,sum3=0,sum4=0;
	 int choice=0;
	Scanner sc = new Scanner(System.in); 

	 
	do{
	System.out.println("*********"+"\n"+"MENU"+"\n"+"1.Tea (Rs. 10)"+"\n"+"2.Green Tea (Rs. 15)"+
	"\n"+"3.Samosa (Rs. 20)"+"\n"+"4.Sandwitch (Rs. 50)"+"\n"+"0.Generate Bill"+"\n"+"*********");	
	System.out.print("Enter ur choice = ");
	choice = sc.nextInt();
	if ( choice == 0)
	 break;
	System.out.print("Enter ur Quantity = ");
	int var1 = sc.nextInt();
	switch(choice)
	 {
	   case 1:
	   sum1 =sum1 + var1 * 10;
	    count1 ++;
	   break;
	   case 2:
	   sum2 =sum2 + var1 * 15;
	    count2 ++;
	   break;
	   case 3:
	   sum3 =sum3 + var1 * 20;
	    count3 ++;
	   break;
	   case 4:
	   sum4 =sum4 + var1 * 50;
	    count4 ++;
	   break;
	   default :
	   System.out.println("Wrong input");
	  }
	 }while(choice!=0);
	 
	System.out.println("***Bill***");
	if (count1!=0)
	 System.out.println("Tea "+ sum1 );
	if (count2!=0)
	 System.out.println("Green tea "+ sum2 );
	if (count3!=0)
	 System.out.println("Samosa "+ sum3 );
	if (count4!=0)
	 System.out.println("Sandwitch "+ sum4 );
	System.out.println("------------------------");
	int total=sum1+sum2+sum3+sum4;
	System.out.println("  Total =    " + total);

	}
	}

