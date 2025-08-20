package Unit13.CodeIt;


import java.util.*;

public class SwapAnyTypes {

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        String firstString;
        String secondString;
        Integer firstInt;
        Integer secondInt;
        System.out.print("Enter a string >> ");
        firstString = kb.nextLine();
        System.out.print("Enter a string >> ");
        secondString = kb.nextLine();
        System.out.print("Enter a integer >> ");
        firstInt = kb.nextInt();
        System.out.print("Enter a integer >> ");
        secondInt = kb.nextInt();
        swap(firstString, secondString);
        swap(firstInt, secondInt);
    }
    public static <T> void display(T first, T second)
    {
        System.out.println(first + " " + second);
    }
    public static <T> void swap(T first, T second)
    {
        T temp;
        display(first, second);
        temp = first;
        first = second;
        second = temp;
        display(first, second);
    }
}
