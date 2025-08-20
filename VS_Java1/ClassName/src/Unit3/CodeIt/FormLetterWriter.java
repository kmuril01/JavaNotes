//Progam Form Letter Writer 
//Programmer Kevin Murillo
//Programming Excercise 3-10

import java.util.Scanner;
public class FormLetterWriter 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        String first, last;
        System.out.print("Enter first name >> ");
        first = kb.nextLine();
        System.out.print("Enter last name >> ");
        last = kb.nextLine();

        displaySalutation(first);
        displayLetter();
        displaySalutation(first,last);
        displayLetter();

    }    

    public static void displaySalutation(String firstName)
    {

        System.out.println("Dear " + firstName + ",");

    }
    public static void displaySalutation(String firstName, String lastName)
    {
    System.out.println("Dear " + firstName + " " + lastName + ",");

    }

    public static void displayLetter()
    {
        System.out.println("    Thank you for your recent oder.\n");
    }
}