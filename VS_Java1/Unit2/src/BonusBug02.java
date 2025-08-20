// Enter a number from 1 to 100 using your keyboard
import java.util.Scanner;
public class BonusBug02
{
   public static void main(String[] args)
   {
	int guess_number;
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Welcome to the Guessing Game!!!!");
	System.out.print("Please enter your guessed number from 1 - 100:  ");
	guess_number = keyboard.nextInt();
	System.out.println("Your guessed number is: " + guess_number);
   }
}
