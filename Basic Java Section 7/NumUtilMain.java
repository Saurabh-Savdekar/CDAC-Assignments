package com.tester;

import java.util.Scanner;




public class NumUtilMain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double val;
       do {
           NumUtil.display();
           System.out.println("Enter your choice or press 0 to exit:");
           int num = scan.nextInt();
           if (num == 0) {
               break;
           }
           switch (num) {

               case 1:
                   System.out.println("Enter a base number: ");
                   int p = scan.nextInt();
                   System.out.println("Enter exponent: ");
                   int e = scan.nextInt();
                 //  NumUtil.getPower(p,e);
                   System.out.println(+p+ "to the power” +e+ “ is:"+NumUtil.getPower(p,e));

                   break;
               case 2:
                   System.out.println("Enter a number: ");
                   int f = scan.nextInt();
                  // NumUtil.getFactorial(f);
                   System.out.println("Factorial is:"+NumUtil.getFactorial(f));
                    break;
               case 3:
                    System.out.println("Enter a number: ");
                    int g= scan.nextInt();
                    NumUtil.isPrime(g);
                    break;
               case 4:
                   System.out.println("Enter a number: ");
                   int a = scan.nextInt();
                   NumUtil.isEven(a);
                   break;
               case 5:
                   System.out.println("Enter a number: ");
                   int b = scan.nextInt();
                   NumUtil.isOdd(b);
                   break;
               default:
                   System.out.println("Invalid choice");
           }
       }while(true);




    }
}