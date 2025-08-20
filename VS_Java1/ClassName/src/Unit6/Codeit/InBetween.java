package Unit6.Codeit;

import java.util.*;

public class InBetween {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num1;
        int num2;
        int diff;
        int x;

        System.out.print("Enter an integer >> ");
        num1 = kb.nextInt();

        System.out.print("Enter another integer >> ");
        num2 = kb.nextInt();

        diff = num1 - num2;
        if (diff >= -1 && diff <= 1)
            System.out.println("There are no integers between " + num1 + " and " + num2);
        else 
        {
            System.out.print("The numbers between " + num1 + " and " + num2 + " include:");
            if (num1 > num2) {
                for (x = num2 + 1; x < num1; x++) {
                    System.out.print(" " + x);
                }
            } else {
                for (x = num1 + 1; x < num2; x++) {
                    System.out.print(" " + x);
                }
            }
        }

        System.out.println();
    }
    
} 
          
            /*
            for (int i = num1 + 1; i < num2; i++) {
                System.out.print(" " + i);
            }
        } else if (num1 > num2) {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.print(" " + i);
            }
        } else {
            System.out.print("There are no integers between the entered values.");
        }

        System.out.println(); // Print a new line for formatting
        kb.close();
        */
