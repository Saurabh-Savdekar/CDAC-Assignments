//Write a program to check whether a given number is a perfect number or not.


import java.util.Scanner;
public class Sec4Que11{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter no.:");
   int Num=sc.nextInt();
   int sum=0;
   for(int i=1;i<=Num/2;i++)
   {
       if(Num%i==0)
       {
            sum=sum+i;
       }

   }
   if(sum==Num && Num>0)
   {
       System.out.println(Num+" perfect no.");
   }
   else
   System.out.println(Num+" not perfect no.");
    }
}
