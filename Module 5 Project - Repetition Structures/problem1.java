/*Problem 1:
Write a program that reads a set of floating-point values. Ask the user to enter the values, then print:
The average of the values
The smallest of the values
The largest of the values
The range, that is the difference between the smallest and the largest
Of course, you may only prompt for the values once.*/
import java.util.Scanner;
import java.lang.Math.*;
public class problem1{

     public static void main(String []args){
      Scanner sc = new Scanner(System.in);  
      System.out.print("Please enter how many values in total:");          
      float[] numbers = new float [sc.nextInt()];      

      //puts the input values into an array 
      System.out.println("Enter the values one by one:"); 
      for (int i = 0; i < numbers.length; i++)   
      {  
      numbers[i] = sc.nextFloat();  
      }   
      
      //average
      float total = 0;
      for (int i = 0; i < numbers.length; i++)   
      {  
         total += numbers[i];
      }
      System.out.println("The average of the values is "+total/numbers.length);
      
      //sort from least to greatest
      for (int i = 0; i < numbers.length; i++)   
      {  
         for (int j = i+1; j < numbers.length; j++) 
         {
                if (numbers[j] < numbers[i])
                {
                  float temp = numbers[i];
                  numbers[i] = numbers[j];
                  numbers[j] = temp;
                }
         }
         //System.out.println(numbers[i]);
      }
      System.out.println("The smallest of the values is "+numbers[0]);
      System.out.println("The largest of the values is "+numbers[numbers.length-1]);
      System.out.println("The range, that is the difference between the smallest and the largest is "+(numbers[numbers.length-1]-numbers[0]));
   }
}