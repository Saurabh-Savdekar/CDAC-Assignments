//Write a java program to calculate compound interest, get the required inputs using Scanner 

import java.util.Scanner;
public class Sec2Que7{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle:");
        int p=sc.nextInt();
      System.out.println("rate:");
        float r=sc.nextInt();
     System.out.println("duration:");
        float t=sc.nextInt();

   
        double ci = (p * (Math.pow((1 + r/100), t))) - p;

      
        System.out.println("CI: "+ci);


    sc.close();
    }
}
