//Write a Java program to check if character entered by user is a vowel, consonant or other character.

import java.util.Scanner;

public class Sec3Que18{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter char:");
    char ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        System.out.println(ch+" is Vowel");
    }
        else if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z'){
        System.out.println(ch+" is Consonant");
            }   
             else
        System.out.println(ch+ "not Char");
        
     sc.close();    
    }
}
