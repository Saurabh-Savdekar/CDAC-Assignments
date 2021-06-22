// Write a java program to calculate simple interest, get the required inputs from command line 

public class Sec1Que7 {

 public static void main(String[] args){
        
		 double p = Double.parseDouble(args[0]);
         double r = Double.parseDouble(args[1]);
         double n = Double.parseDouble(args[2]);

		 double simple_intrest = 0;
		 
		 simple_intrest = (p*r*n)/100;
		 
         
         System.out.println("The Simple Intrest is : " +simple_intrest);


   }
}