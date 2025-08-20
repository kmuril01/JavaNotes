
package Unit3.Honors;

import java.util.Scanner;

public class BonusBug03 
{
    public static void main(String[] args)
     {
         int num1, num2, result;
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter an integer value for first number ");
         num1 = keyboard.nextInt();
         System.out.println("Enter an integer value for second number ");
         num2 = keyboard.nextInt();
         result = product(num1,num2); 	System.out.println("The product of " + num1 + " and " + num2 + 	" is : " + result);
     }   
    public static int product(int number1, int number2)
     {
     int productTotal;
     productTotal = number1 * number2;
     return productTotal;
     }
 }