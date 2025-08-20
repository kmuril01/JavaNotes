package Unit7.CodeIt;

import java.util.*;

public class CountSpaces {

    public static void main(String[] args) {
        
        String aString = "Life is like a box of chocolates";
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