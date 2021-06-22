/*
. Write a program to make such a pattern like a pyramid with a number which will repeat the number in the same row as shown below : 
   1
  2 2
 3 3 3
4 4 4 4

*/

import java.util.Scanner;
public class Sec4Que10{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("no. of rows:");
   int row=sc.nextInt();
   int i,j,n=1;
   for(i=1;i<=row;i++){

       for(j=row-i;j>0;j--){
        System.out.print(" ");
       }
       for(j=1;j<=i;j++){
       System.out.print(n+" ");
       
       }
       n++;
       System.out.println("");
       }
    }
}
