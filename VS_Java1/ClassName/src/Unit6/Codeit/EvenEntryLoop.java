package Unit6.Codeit;

import java.util.*;

public class EvenEntryLoop {

    public static void main(String[] args) {
  
        final int QUIT = 999;
        int number;

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an even number or " + QUIT + 
        " to quit >>");
        number = kb.nextInt();

        while (number != QUIT) {
            if (number % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println(number + " is not an ever number");
            }
            
            System.out.print("Enter an even number or " + QUIT + " to quit >> ");
            number = kb.nextInt();
        }

    }
    
}
