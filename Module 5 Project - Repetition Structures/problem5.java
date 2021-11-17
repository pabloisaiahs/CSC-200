/*Problem 5:
Imagine yourself in the middle of Manhattan, where the streets are perpendicular on avenues. 
You are in a grid of streets, somewhat lost, and you randomly pick one of four directions and walk to the next intersection. 
Not knowing where you really want to go, you again randomly pick one of the four directions, and so on. After repeating the 
movement for a number of times, you may want to know how far you got from the original point.

Represent locations as integer pairs(x,y). Create an algorithm that implements your movement through New York City, over 100 
intersections, starting at (0,0) and print the ending location, taking into consideration that each movement, from one 
intersection to another will be one mile.
*/
import java.util.Scanner;
import java.lang.Math.*;
public class problem5{

     public static void main(String []args){
      int x = 0, y = 0;
      int north = 1, east = 1, south = -1, west = -1;
      
      //loop through picking random directions
      for(int i=0; i<100; i++){
       int dir = (int) (Math.random()*4);
        if(dir == 1){ x += north; }
        else if (dir == 2){ y += east; }
        else if (dir == 3){ x += south; }
        else if (dir == 4){ y += west; }
       //System.out.println("( "+x+" , "+y+")");
      }

      int xdist = Math.abs(x);
      int ydist = Math.abs(y);
      int totalMiles = xdist + ydist;
      
      //prints the final location
      System.out.println("Miles walked: "+totalMiles+"m");
      System.out.println("Final location relative to North and East being \ngreater than zero (Nor/Sou,Eas/Wes) : "+"( "+x+" , "+y+")");
   }
}