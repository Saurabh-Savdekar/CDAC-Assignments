//. Write a java program to ask user to enter a number between 1 and 7, print week day as per below mappings - 
// (1 - Monday, 2-Tuesday, .... 7-Sunday)

import java.util.Scanner;
public class Sec3Que17{

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Num:");
   int Num=sc.nextInt();
   switch(Num){
	   case 1: System.out.println("Monday");
	   break;
	   case 2:System.out.println("tuesday");
	   break;
	   case 3:System.out.println("Wednsday");
	   break;
	   case 4:System.out.println("Thurday");
	   break;
	   case 5:System.out.println("Friday");
	   break;
	   case 6:System.out.println("Satday");
	   break;
	   case 7:System.out.println("Sunday");
	   break;	   
       default:System.out.println("Invalid Input");
	   
   }

	   sc.close();
}
}
