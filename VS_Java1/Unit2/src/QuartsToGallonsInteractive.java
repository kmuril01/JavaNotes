// Programmer Kevin Murillo
import java.util.Scanner;

public class QuartsToGallonsInteractive

{
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded;
        int gallonsNeeded;
        int extraQuartsNeeded;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter quarts needed >> ");
        quartsNeeded = input.nextInt();

        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;

        System.out.println("A job that needs" + quartsNeeded +
        " quarts requires " + gallonsNeeded + " gallons plus " + 
        extraQuartsNeeded + " quarts.");

    }

}