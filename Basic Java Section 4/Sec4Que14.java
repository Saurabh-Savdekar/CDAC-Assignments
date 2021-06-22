//Write a program to display the first n terms of Fibonacci series. 

import java.util.Scanner;
public class Sec4Que14{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter terms.:");
   int terms=sc.nextInt();
  int first=0,second=1,sum=0;
  System.out.print(first+" "+second);
  for(int i=2;i<terms;++i){
      sum=first+second;
    System.out.print(" "+sum);
   first=second;
   second=sum;
  }
sc.close();
}
}

