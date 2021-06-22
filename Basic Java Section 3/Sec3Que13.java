//Write a Java program to print the ascii value of a given character.

import java.util.Scanner;
public class Sec3Que13{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   System.out.println("Enter Char:");
   char ch=sc.next().charAt(0);
   int ascii=ch;
   System.out.println("ascii of "+ch+" = "+ascii);
    
    sc.close();
}
}
