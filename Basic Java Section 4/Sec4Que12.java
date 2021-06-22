//Write a program to check whether a given number is an armstrong number or not.

import java.util.Scanner;
public class Sec4Que12{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter no.:");
   int Num=sc.nextInt();
    int sum=0,a,temp=Num;
   while(Num>0){
       a=Num%10;
       Num=Num/10;
       sum=sum+(a*a*a);
   }
   if(temp==sum)
   {
       System.out.println("armstrong ");
   }
   else
   System.out.println("not armstrong");
    }
}
