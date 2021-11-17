/*Problem 2:
Write a program that reads a word and prints each character of the word on a separate line. For example, if the user provides the input "Harry", the program prints:
H
a
r
r
y*/
import java.util.Scanner;
import java.lang.Math.*;
public class problem2{

     public static void main(String []args){
      Scanner sc = new Scanner(System.in);  
      System.out.print("Say your favorite word: ");          
      String word = sc.nextLine();
      for(int i = 0; i < word.length(); i++)
      { 
         System.out.println(word.charAt(i));
      }      
   }
}