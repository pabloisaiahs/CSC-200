#Problem 5:
#Read a word from the user and display the string with the letters shifted to the right by two positions 
#and with the letters shifted to the left by two positions in the string. Save all of the three strings in 
#separate variables and display all three of them at the end of the program.

import java.util.Scanner;
public class problem5{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Say a word, anyword.");
        String word = sc.nextLine();
        //String word = "pickle";
        System.out.println("The word is: "+word);
        System.out.println("The length is: "+word.length());
        
        //Shift to the right by 2
        String rightWord = "";
        rightWord= rightWord+word.charAt(word.length()-2)+word.charAt(word.length()-1);
        for(int i=0;i<word.length()-2;i++)
        {
            rightWord= rightWord+word.charAt(i);         
         }
        System.out.println("Shift Right: "+rightWord);
        
        //Shift to the left by 2
        String leftWord = "";
        leftWord= leftWord+word.charAt(2)+word.charAt(3);
        for(int i=4; i<word.length(); i++)
        {
         leftWord= leftWord+word.charAt(i);
         if(i==word.length()-1){leftWord= leftWord+word.charAt(0)+word.charAt(1);}         
        }
        System.out.println("Shift Left: "+leftWord);
     }
}
