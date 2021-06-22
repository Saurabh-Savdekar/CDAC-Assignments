//Write a java program to convert temperature from celsius to fahrenheit, get input from command line 

public class Sec1Que8{
    public static void main(String args[]){
       double c=Double.parseDouble(args[0]);
       double F=(9*c/5)+32;
       System.out.println("F="+F);
    }
} 
