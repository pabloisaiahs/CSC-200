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