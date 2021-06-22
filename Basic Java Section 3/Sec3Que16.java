//Write a java program to ask user to enter test marks of three subjects such as Phy, Chem, Math. Max marks for each subject is 100. Now calculate average of marks. Display following message based on average marks calculated - 

import java.util.Scanner;
public class Sec3Que16{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Subjects Marks physics, Chem, Math:");      

        int arr[]=new int[3];
        for(int i=0;i<3;i++){
          arr[i]=sc.nextInt();   
        }
        double percentage= (arr[0]+arr[1]+arr[2])/3;
        System.out.println("Percentage: "+percentage);
        System.out.println("Division: ");
        
       if(percentage<30){
System.out.println("you are failed");
}
else if(percentage>=30 && percentage<60){
        System.out.println("passed with Second division");
        }
         else if(percentage>=60 && percentage<80){
        System.out.println("passed wirh Fiear division ");
         }
        
        else
        System.out.println("passed with first class with distinction");
    
    sc.close();
}
}
