//Write a program to add two matrix of numbers

package com.tester;
import java.util.Scanner;

public class Sec8Que10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[][] num1 = new int[3][3];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                System.out.println("Enter element for first matrix....");
                System.out.println("Enter [" + i + "] [" + j + "] element");
                num1[i][j] = scan.nextInt();
            }
        }

        int[][] num2 = new int[3][3];
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                System.out.println("Enter element for second matrix....");
                System.out.println("Enter [" + i + "] [" + j + "] element");
                num2[i][j] = scan.nextInt();
            }
        }

        System.out.println("First matrix is...........");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                System.out.print("\t" + num1[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("Second matrix is...........");
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                System.out.print("\t" + num2[i][j]);
            }
            System.out.println("\n");
        }

        int sum[][]= new int[3][3];
        System.out.println("Addition of both matrix");

        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                sum[i][j] = num1[i][j]+ num2[i][j];
                System.out.print("\t" + sum[i][j]);
            }
            System.out.println("\n");
        }
    }
}