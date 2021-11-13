/*Problem 5
Usually years that are divisible by 4 are leap years, for example 1996. 
However, years that are divisible by 100 (for example 1900) are not leap years, 
but years that are divisible by 400 are leap years (for example 2000). 
Write a program that asks the user for a year and computes whether that year 
is a leap year. Use a single if statement and Boolean operators.*/
import java.util.Scanner;
import java.lang.Math.*;
public class problem5{

     public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a year:");
     int year = sc.nextInt();

     if(year%4!=0 || (year%100==0 && year%400!=0)){        
        System.out.println(year+" is not leap year");
     }else{ System.out.println(year+" is a leap year"); }
     
   }
}