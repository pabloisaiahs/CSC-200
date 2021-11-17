/*Problem 3:
The Fibonacci numbers are defined by the sequence:
f1 = 1
f2 = 1
fn = fn-1 + fn-2.
Reformulate that as
Fold1 = 1;
Fold2=1;
Fnew=fold1+fold2;
After that, discard fold2, which is no longer needed, and set fold2 to fold1, and fold1 to fnew. Repeat an appropriate number of times.
Implement a program that prompts the user for an integer n and prints the nth Fibonacci number, using the above algorithm.*/
import java.util.Scanner;
import java.lang.Math.*;
public class problem3{

     public static void main(String []args){
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter fibonacci place value: ");
      int nth = sc.nextInt();
      
      //defines first 2 values, also instantiates the place value
      int fold1 = 1;
      int fold2 = 1;
      int placeVal = 0;
      
      //creates fib sequence
      for(int i=0; i < nth ; i++)
      {
          System.out.print(fold2 + " ");
          placeVal = fold2;
          int fnew= fold1+fold2;         
          fold2 = fold1;
          fold1 = fnew;
      }
      
      //prints the value at n place
      System.out.println("\nThe Fibonacci value at "+nth+" is "+placeVal);
   }
}