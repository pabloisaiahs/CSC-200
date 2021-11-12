#Problem 2: Write a program that reads in an integer, and breaks it into a sequence of individual digits. Display each digit on a separate line.
import java.util.Scanner;
public class problem2{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        String input = sc.nextLine();
        int length = input.length();
        System.out.println(input+" is "+length+" number(s) long.");
        
        for(int i=0; i < length;i++)
        {
         System.out.println(input.charAt(i));
        }
        
     }
}
