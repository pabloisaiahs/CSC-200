/*Problem 2:
Write a program that reads in the name and salary of an employee. 
Here the salary will denote an hourly wage, such as $9.25. 
Then ask how many hours the employee worked in the past week. 
Be sure to accept fractional hours. Compute the pay. 
Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage. 
Print a paycheck for the employee.*/

import java.util.Scanner;
import java.lang.Math.*;
public class problem2{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter hours of work last week:");
        double hoursWeek = sc.nextDouble();
      
        double paycheck = 0;
        double overtimeHours = 0;
        double hourlyPay = 0;
        
        if(hoursWeek*52 < 2080){
         hourlyPay = salary/(hoursWeek*52);
        }else{
         overtimeHours = (hoursWeek*52)-2080;
         hourlyPay = salary/2080;
         paycheck = (hourlyPay*1.5)*overtimeHours; 
        }
        
        System.out.println(name+"'s hourly wage is $"+hourlyPay+"/hr, with a bonus paycheck of $"+paycheck);    
     }
}