//Write a program to display the number in reverse order.

import java.util.Scanner;
public class Sec4Que15{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter Num.:");
   int Num=sc.nextInt();
   int rev=0;
   while(Num>0)
   {
     int rem=Num%10;
     Num=Num/10;
     rev=rev*10+rem;
   }
   System.out.println(rev);
sc.close();
}
}
