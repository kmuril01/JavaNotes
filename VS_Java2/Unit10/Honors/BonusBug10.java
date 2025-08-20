package Unit10.Honors;

import java.util.*;
public class BonusBug10
{
    public static void main(String args[])
    {
        try
        {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter the size of the array >> ");
            int size = kb.nextInt();
            int[] array = new int[size];
            System.out.println("Enter " + size + " integers >>");
            
            for (int i = 0; i < size; i++) {
                int input = kb.nextInt();
                array[i] = input;
            }
            System.out.println("Enter an index to retrieve >> ");
            int index = kb.nextInt();
            System.out.println(array[index]); //may throw out of bounds exception
        } 
        // handling the array exception
          catch(ArrayIndexOutOfBoundsException error)
        {
            System.out.println(error);
        }
    }
}