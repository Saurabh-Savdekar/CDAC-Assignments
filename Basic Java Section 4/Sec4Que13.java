//Write a program to determine whether a given number is prime or not.

import java.util.Scanner;
public class Sec4Que13{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter no.:");
   int Num=sc.nextInt();
   boolean flag=false;
   if(Num==0 || Num==1)
  {
    System.out.println("not prime");
  }
  else
  for(int i=2;i<=Num/2;i++)
  {
      if(Num%i==0){
      System.out.println("not prime");
   flag=true;
   break;
  }
   }
   if(flag==false){
   System.out.println("prime");
   }
sc.close();
}
}
