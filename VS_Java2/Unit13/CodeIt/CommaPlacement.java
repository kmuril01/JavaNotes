package Unit13.CodeIt;

import java.util.*;

public class CommaPlacement {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        final String QUIT = "ZZZ";

        System.out.print("Enter a word or " + QUIT + " to quit >> ");
        word = input.nextLine();
        while(!word.equals(QUIT))
        {
            words.add(word);
            System.out.print("Enter another word or " + QUIT + " to quit >> ");
            word = input.nextLine();
        }

        Iterator<String> iter = words.iterator();
        if(iter.hasNext())
            System.out.print(iter.next());
        while(iter.hasNext())
            System.out.print(", " + iter.next());
        System.out.println(".");
    }
}

