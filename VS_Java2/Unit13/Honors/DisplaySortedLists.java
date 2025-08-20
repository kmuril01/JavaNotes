package Unit13.Honors;

// Kevin Murillo

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DisplaySortedLists 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        while (true) 
        {
            System.out.print("Enter a word or quit to quit >> ");
            String input = kb.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            stringList.add(input);
            Collections.sort(stringList);
            display(stringList);
        }

        while (true) 
        {
            System.out.print("Enter a number or quit to quit >> ");
            String input = kb.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                intList.add(number);
                Collections.sort(intList);
                display(intList);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    public static <T> void display(ArrayList<T> list) 
    {
        System.out.println("The size of the list is " + list.size());
        for (T item : list) {
            System.out.println(item);
        }
    }
}
