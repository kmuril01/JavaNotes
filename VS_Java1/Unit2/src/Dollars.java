import java.util.Scanner;

public class Dollars 
{

    public static void main(String[] args) 
    {
        final int TWENTY_DOLLAR = 20;
        final int TEN_DOLLAR = 10;
        final int FIVE_DOLLAR = 5;
        final int ONE_DOLLAR = 1;

        int inputDollars;
        int outputTwenty;
        int outputTen;
        int outputFive;
        int outputOne;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of dollars ");
        inputDollars = input.nextInt();

        outputTwenty = inputDollars / TWENTY_DOLLAR;
        outputTen = (inputDollars % TWENTY_DOLLAR) / TEN_DOLLAR;
        outputFive = (inputDollars % TEN_DOLLAR) / FIVE_DOLLAR;
        outputOne = (inputDollars % FIVE_DOLLAR) / ONE_DOLLAR;

        System.out.println(inputDollars + " converted is " + outputTwenty + " $20s, " + 
        outputTen + " $10s, " + outputFive + " $5s, " + outputOne + " $1s");
    }
    
}
