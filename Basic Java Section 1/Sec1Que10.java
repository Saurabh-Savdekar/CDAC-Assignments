//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers received from command line

public class Sec1Que10{
   public static void main(String args[]){
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
       int add=a+b;
       int sub=a-b;
       int mul=a*b;
       double remain=a%b;
     System.out.println("addition="+add+
	                    "subtract="+sub+
						"multiplicatrion="+mul+
						"remainder="+remain);
    }
} 
