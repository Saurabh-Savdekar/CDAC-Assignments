//Write a java program to read roll no, name and marks of three subjects and calculate the total, percentage and division. 

import java.util.Scanner;
public class Sec3Que11{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter RollNo:");
        int rollNo=sc.nextInt();
        System.out.println("enter Subjects Marks physics, Chem, CA:");
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
          arr[i]=sc.nextInt();   
        }

        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollNo);
        double percentage= (arr[0]+arr[1]+arr[2])/3;
        System.out.println("Percentage: "+percentage);
        System.out.println("Division: ");
        
        if(percentage>65){
        System.out.println("first class with distinction");
        }
         else if(percentage>=60 && percentage<65){
        System.out.println("first class ");
         }
        else if(percentage>=55 && percentage<60){
        System.out.println("second class ");
        }
        else if(percentage>=50 && percentage<55){
            System.out.println("second class ");
            }
        else if(percentage>=35 && percentage<50){
            System.out.println("pass class ");
            }
        else 
        System.out.println("fail");
    
    sc.close();
}
}
