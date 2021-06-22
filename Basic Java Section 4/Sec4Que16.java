//Write a program to check whether a number is a palindrome or not.

import java.util.Scanner;
public class Sec4Que16{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter Num.:");
   int Num=sc.nextInt();
   int rev=0;
   int temp=Num;
   while(Num>0)
   {
     int rem=Num%10;
     Num=Num/10;
     rev=rev*10+rem;
   }
   if(temp==rev){
   System.out.println("palindrom");
   }
   else
   System.out.println("not palindrom");
sc.close();
}
}
