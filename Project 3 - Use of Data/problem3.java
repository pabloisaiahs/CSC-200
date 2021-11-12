/*Write a program that asks the user to input:
-The number of gallons of gas in the tank
-The fuel efficiency in miles per gallon
-The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the gas in the car.*/
     
import java.util.Scanner;
public class problem3{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What the number of gallons of gas in the tank?");
        double gallons = sc.nextDouble();
        System.out.println("What the fuel efficiency in miles per gallon?");
        double fuelEfficiency = sc.nextDouble();
        System.out.println("What price of gas per gallon?");
        double gasPrice = sc.nextDouble();

        double costPerHunMile = (gasPrice/fuelEfficiency)*100;
        System.out.println("Cost per 100 miles: $"+costPerHunMile);
        double distanceLeft = gallons*fuelEfficiency;
        System.out.println("Distance available with "+gallons+" gallons left: "+distanceLeft+" miles");
     }
}
