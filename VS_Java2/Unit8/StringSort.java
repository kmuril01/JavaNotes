package Unit8;

import java.util.*;

public class StringSort {

    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
        String[] values = new String[15];
        final String QUIT = "zzz";
        int x = 0;
        int count = 0;
        String word;
        boolean didUserQuit = false;

        //Initializa the array
        for(x = 0; x < values.length; ++x)
            values[x] = QUIT;

        //retrieve string values entered by the user
        x = 0;
        while (x < values.length) {
            System.out.print("Enter a word or " + QUIT + " to quit >> ");
            word = input.nextLine();
            if(word.equals(QUIT))
            {
                count = x;
                x = values.length;
                didUserQuit = true;
            }
            else
            {
                values[x] = word;
                ++x;
            }
        }
        //print array in ascending order
        if(!didUserQuit)
            count = values.length;
            Arrays.sort(values);
        System.out.println("String in order:");
        for(x = 0; x < count; ++x)
            System.out.print(values[x] + " ");
        System.out.println();
    }
}
