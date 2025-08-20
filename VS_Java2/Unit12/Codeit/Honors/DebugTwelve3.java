package Unit12.Codeit.Honors;

import java.util.Scanner;
public class DebugTwelve3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int LINES = 5;
      String word;

      System.out.print("Enter a word to display " + LINES + " times >> ");
      word = input.nextLine();
      display(word, 0, LINES);
   }
   public static void display(String word, int spaces, int lines)
   {
      final int GAP = 3;
      if(lines == 0)
         return;
      else
      {
        for (int x = 0; x < spaces; x++) 
        { 
        System.out.print(" ");
        }
    System.out.println(word); 
    display(word, spaces + GAP, lines - 1);
      }
    }
}