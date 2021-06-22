/* Write a java program to read roll no, name and marks of three subjects and calculate the total and percentage. 
Test Data :
Input the Roll Number of the student :784
Input the Name of the Student :James
Input the marks of Physics, Chemistry and Computer Application : 70 80 90

Expected Output :
Roll No : 784
Name of Student : James
Marks in Physics : 70
Marks in Chemistry : 80
Marks in Computer Application : 90
Total Marks = 240
Percentage = 80.00
*/

import java.util.Scanner;
public class Sec2Que8{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter roll no:");
        String rollno = sc.nextInt();

        System.out.println("enter Name:");
        String name = sc.nextLine();
        
        System.out.println("enter Physics marks:");
        int phy = sc.nextInt();
 
   System.out.println("enter Chemistry marks:");
        int chem = sc.nextInt();

   System.out.println("enter Computer Application marks:");
        int CA = sc.nextInt();
	System.out.println("Name: "+rollno);	
    System.out.println("Name: "+name);
    System.out.println("Marks in Physics: "+phy);
    System.out.println("Marks in Chemistry: "+chem);
    System.out.println("Marks in Computer Application: "+CA);

System.out.println("Total Marks: "+(phy+chem+CA));


System.out.println("Percentage: "+((phy+chem+CA)*100/300));
    sc.close();
    
}
}


