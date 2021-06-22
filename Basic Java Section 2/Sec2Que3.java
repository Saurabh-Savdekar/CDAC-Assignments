//Write a java program to calculate simple interest, get the required inputs from Scanner ?


import java.util.Scanner;
public class Sec2Que3 {
            
	public static void main(String args[]){
	          
         Scanner sc = new Scanner(System.in);
             
            System.out.println("Enter the Principal Amount ");
                 float a = sc.nextFloat();
				
            System.out.println("Enter the Rate ");
                 float b = sc.nextFloat();
            
			System.out.println("Enter the no of year ");
                 float c = sc.nextFloat();

        float Simple_Intrest = (a * b * c)/100;

    		System.out.println("The Simple Intrest is " + Simple_Intrest);
			
			
			}
}