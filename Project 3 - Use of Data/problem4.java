#Problem 4: Write a program that asks the user to enter the name of his or her favorite city. use a String variable to store the input. The program should display the following:
#The number of characters in the city name
#the name of the city in all uppercase letters
#the name of the city in all lower case letters
#the first character in the name of the city

import java.util.Scanner;
public class problem4{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your favorite city?");
        String city = sc.nextLine();
        
        System.out.println("Number of characters: "+city.length());
        System.out.println("name of the city in uppercase: "+city.toUpperCase());
        System.out.println("name of the city in lower case: "+city.toLowerCase());
        System.out.println("first character: "+city.charAt(0));
     }
}
