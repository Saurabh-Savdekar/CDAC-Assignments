//Write a java program to ask user to enter month number (1-12) , print month name as per below mappings - 
//(1 - January, 2-Feburary ... 12- December)

import java.util.Scanner;
public class Sec3Que19{

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Month:");
   int Num=sc.nextInt();
   switch(Num){
	   case 1: System.out.println("January");
	   break;
	   case 2:System.out.println("Febuary");
	   break;
	   case 3:System.out.println("March");
	   break;
	   case 4:System.out.println("April");
	   break;
	   case 5:System.out.println("May");
	   break;
	   case 6:System.out.println("June");
	   break;
	   case 7:System.out.println("July");
	   break;
           case 8:System.out.println("Augast");
	   break;
	   case 9:System.out.println("September");
	   break;
	   case 10:System.out.println("Octomber");
	   break;
	   case 11:System.out.println("November");
	   break;
	   case 12:System.out.println("December");
	   break;	   
           default:System.out.println("Invalid Input");
	   
   }

	   sc.close();
}
}
