package Unit10.Code;

//Programmer Kevin Murillo
//Program Excercise 10-2

import java.util.*;

public class TryToParseDouble {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        double num;
        try{
            System.out.print("Enter a floating point number >> ");
            num = Double.parseDouble(keyboard.nextLine());
        }
        catch(NumberFormatException error)
        {
            num = 0;
            System.out.println("Value entered cannot be converted");
            System.out.println("    to a floating-point number");
        }
        System.out.println("Number is " + num);

    }

}
