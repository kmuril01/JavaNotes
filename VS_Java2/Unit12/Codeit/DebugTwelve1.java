package Unit12.Codeit;

import java.util.Scanner;
public class DebugTwelve1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int reps;
      String userInput;
      System.out.print("Enter number of repetitions >> ");
      userInput = input.nextLine();
      reps = Integer.parseInt(userInput);
      repMethod(reps);
   }
   public static void repMethod(int reps)
   {
      if(reps > 0)
      {
         System.out.println("Counting " + reps);
         repMethod(reps - 1);
      }
   }
}
