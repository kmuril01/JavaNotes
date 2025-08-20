package Unit5.CodeIt.FiveTen;

import java.util.Scanner;

public class TwelveDays {

    public static void main(String[] args) {
        int choice;
        String entry;
        double total = 0;
        double price;
        choice = getChoice();
        String suffix;
        if(choice >= 4)
        suffix = "th";
        else if(choice == 3)
        suffix = "rd";
        else
        suffix = "nd";

            System.out.println("On the " + choice + suffix +
             " day of Christmas");
            System.out.println("My true love gave to me");

            switch (choice) {
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking");
                case 7:
                    System.out.println("Seven swans a-swimming");
                case 6:
                    System.out.println("Six geese a-laying");
                case 5:
                    System.out.println("Five golden rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three French hens");
                case 2:
                    System.out.println("Two turtle doves and");
                case 1:
                    System.out.println("A partridge in a pear tree");
                    break;
                    default:
                    System.out.print("Invalid choice");
                    }
        }
        public static int getChoice()
        {
            Scanner scanner = new Scanner(System.in);
            int choice;
            String entry;
            System.out.println("From what day do you want to start");
            System.out.print("the song The Twelve Days of Christmas? >> ");
            choice = scanner.nextInt();
            return choice;
        }
}
