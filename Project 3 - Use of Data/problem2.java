#Problem 2
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
