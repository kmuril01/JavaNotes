package Unit7.CodeIt;

import java.util.*;

public class CountSpaces2 {

    public static void main(String[] args) {
        String aString;

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an inspirational quote >>");
        aString = kb.nextLine();      
        
        int numSpaces = 0;
        int stringLength = aString.length();

        for(int i = 0; i < stringLength; i++)
        {
            char ch = aString.charAt(i);
            if(ch == ' ')
                numSpaces = numSpaces + 1;
        }

        System.out.println("The number of spaces is " + numSpaces);

    }
    
}
