/*Problem 1:
Write a program that reads the ages of three persons from the user, 
and decides who is the oldest, and who the youngest person is.*/
import java.util.Scanner;
import java.lang.Math.*;
public class problem1{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter age of sibling 1: ");
        int age1 = sc.nextInt();
        System.out.println("Enter age of sibling 2: ");
        int age2 = sc.nextInt();
        System.out.println("Enter age of sibling 3: ");
        int age3 = sc.nextInt();
        
        int oldest = Math.max(age1, Math.max(age2,age3));
        System.out.println("The oldest sibling is "+oldest+" years old.");
        int youngest = Math.min(age1, Math.min(age2,age3));
        System.out.println("The youngest sibling is "+youngest+" years old.");       
     }
}