//Write a program to find the smallest of five numbers

import java.util.Scanner;
public class Sec3Que10{

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Num1:");
   int Num1=sc.nextInt();
   System.out.println("Enter Num2:");
   int Num2=sc.nextInt();
   System.out.println("Enter Num3:");
   int Num3=sc.nextInt();
  System.out.println("Enter Num4:");
   int Num4=sc.nextInt();
  System.out.println("Enter Num5:");
   int Num5=sc.nextInt();
          int one=Num1<Num2?Num1:Num2;
	  int two=Num3<one?Num3:one;
          int three=Num4<two?Num4:two;
          int four=Num5<three?Num5:three;
	   System.out.println(four+" is smaller");
	   sc.close();
}
}
