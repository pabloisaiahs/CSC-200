import java.util.Scanner;
public class problem1{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of meters: ");
        double meters = sc.nextDouble();
        
        double miles = meters/1609;
        System.out.println("Miles: " + miles);
        
        double feet = meters*3.281;
        System.out.println("Feet: " + feet);
        
        double inches = meters*39.97;
        System.out.println("Inches: " + inches);
     }
}