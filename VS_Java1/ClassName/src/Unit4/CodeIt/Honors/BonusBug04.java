package Unit4.CodeIt.Honors;

import java.lang.Math;
import java.util.Scanner;

public class BonusBug04
{
   public static void main(String args[])
    {

    Scanner keyboard = new Scanner(System.in);
    double power,squareRoot,num4,rounded;
    int num1,num2,num3,maximumValue,minimumValue;
    System.out.println("Enter a integer value: ");
    num1 = keyboard.nextInt();
    System.out.println("Enter a integer value: ");
    num2 = keyboard.nextInt();
    System.out.println("Enter a integer value: ");
    num3 = keyboard.nextInt();
    System.out.println("Enter a double value: ");
    num4 = keyboard.nextDouble();

    /* pow method will return the value of argument 1 which is raised to the power of argument 2. What is the correct syntax for 2 raised to the power of 3 to get the result of 8
    */
    power = Math.pow(num1, num2);
    System.out.println("The power of " + num1 + " and " + num2 + " is : " + power);

    /* max method will return the maximum value of two arguments
    */
    maximumValue = Math.max(num1,num2);
    System.out.println("The maximum value of " + num1 + " and " + num2 + " is : " + maximumValue);

    /* min method will return the maximum value of two arguments
    */
    minimumValue = Math.min(num1,num2);
    System.out.println("The minimum value of " + num1 + " and " + num2 + " is : " + minimumValue);

    /* Squareroot method will return the double value of a double argument
    */
    squareRoot = Math.sqrt(num3);
    System.out.println("The square root value of " + num3 + " is : " + squareRoot);

    /* round method will return the closet value of the number without decimal places
    */
    rounded = Math.round(num4);
    System.out.println("The rounded value of " + num4 + " is : " + rounded);

	}
}
