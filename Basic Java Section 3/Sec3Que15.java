//Write a java program to check if a given number is divisble by 3 and 5 .

import java.util.Scanner;
public class Sec3Que15{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   System.out.println("Enter number");
   int num=sc.nextInt();
   if(num%3==0 && num%5==0 ){
       System.out.println(num+" is divisible by 3 & 5");
   }
   else if(num%3==0){
   System.out.println(num+" is divisible by 3 but not by 5");
   }
   else if(num%5==0){
   System.out.println(num+" is divisible by 5 but not by 3");
   }
else
System.out.println(num+" not divisible by both");
    sc.close();
}
}
