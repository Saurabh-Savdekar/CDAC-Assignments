//Write a java program to take three numbers from command line and print the average 

public class Sec1Que6 {

 public static void main(String[] args){
    
		  int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
          int c = Integer.parseInt(args[2]);

		 int avg = 0;
		 
		 avg = (a+b+c)/3;
		 
         
         System.out.println("The avg is : " +avg);


   }
}