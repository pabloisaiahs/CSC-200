/*Problem 4:
Write a program asks the user to enter a month 
(1 for January, 2 for February, and so on) 
and then prints the number of days in the month. For February, print "28 or 29 days".
For example:
Enter a month: 5
30 days
Do not use a separate if/else branch for each month. Use Boolean operators.*/

import java.util.Scanner;
import java.lang.Math.*;
public class problem4{

     public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a month in its numerical form:");
     int month = sc.nextInt();
        
     switch(month)
      { 
      case 1: System.out.println("Januaray has 31 days."); break;
      case 2: System.out.println("February has 28 days."); break;
		case 3: System.out.println("March has 31 days."); break;
      case 4: System.out.println("April has 30 days."); break;
      case 5: System.out.println("May has 31 days."); break;
      case 6: System.out.println("June has 30 days."); break;
      case 7: System.out.println("July has 31 days."); break;
      case 8: System.out.println("August has 31 days."); break;
      case 9: System.out.println("September has 30 days."); break;
      case 10: System.out.println("October has 31 days."); break;
      case 11: System.out.println("November has 30 days."); break;
      case 12: System.out.println("December has 31 days."); break;
      default: System.out.println("Unfortunately, there are only 12 months here on Earth as of right now :("); break;		
      }    
     }
}