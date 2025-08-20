package Unit5.CodeIt.Bonus;

import java.util.Scanner;

public class BonusBug05 {
    public static void main(String args[]) {
        int guess_number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your guessed number from 1 - 100: ");
        guess_number = keyboard.nextInt();
        if (guess_number >= 1 && guess_number <= 100) {
            System.out.println("Your guessed number is: " + guess_number);
            System.out.println("This number is valid and within the specified range (1-100).");
        } else {
            System.out.println("You entered " + guess_number + ". This number is invalid as it is not within the specified range (1-100)");
        }
    }
}

