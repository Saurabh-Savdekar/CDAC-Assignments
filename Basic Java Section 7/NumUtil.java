package com.tester;

import java.util.Scanner;


	public class NumUtil {
        Scanner scan = new Scanner(System.in);
        static void display(){
            System.out.println("1. getPower");
            System.out.println("2. getFactorial");
            System.out.println("3. isPrime");
            System.out.println("4. isEven");
            System.out.println("5. isOdd");
        }

        static double getPower(double x ,int n){
            int pow =1;
            while (n!=0){
                pow*=x;
                n--;
            }
            return pow;
        }

        static long getFactorial(int num) {
            long fact=1;
            for (int i =1;i<=num;i++){
                fact= fact*i;
            }
            return fact;
        }

        static boolean isPrime(int num) {
            int flag =0;
            if(num ==0||num==1){
                System.out.println(num+ " is not a prime number");
            }
            else {
                for(int i=2;i<num;i++){
                    if(num%i==0){
                        System.out.println(num+" is not a prime number");
                        flag =1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println(num+ " is a prime number");
                }
            }
            return true;

        }

        static boolean isEven(int num) {
            if(num%2==0)
            {
                System.out.println(num+" is a even number");
            }
            else{
                System.out.println(num+" is not a even number");
            }
            return  true;
        }

        static boolean isOdd(int num)
        {
            if(num%2!=0)
            {
                System.out.println(num+" is a odd number");
            }
            else{
                System.out.println(num+" is not a odd number");
            }
            return  true;
        }

}

