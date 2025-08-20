package Unit3.CodeIt.ExtraCredit;

//Progam Form Book Billing
//Programmer Kevin Murillo
//Programming Excercise 3-11

import java.util.Scanner;

public class BookBilling 
{
    public static final double BOOK_PRICE = 14.99;
    public static final double TAX_RATE = 0.08;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Prompt user for quantity ordered
        System.out.print("Enter quantity ordered  >> ");
        int quantity = kb.nextInt();

        // Prompt user for coupon value
        System.out.print("Enter coupon value >> ");
        double couponValue = kb.nextDouble();

        // Test all three overloaded methods
        System.out.printf("One book is $%.4f\n", computeBill());
        System.out.printf("%d books with no coupon are $%.4f\n", quantity, computeBill(quantity));
        System.out.printf("%d books with a coupon worth $%.1f are $%.4f\n", quantity, couponValue, computeBill(quantity, couponValue));

    }

    public static double computeBill() 
    {
        return computeBill(1);
    }

    public static double computeBill(int quantity) 
    {
        return computeBill(quantity, 0);
    }

    public static double computeBill(int quantity, double couponValue) 
    {
        double subtotal = quantity * BOOK_PRICE - couponValue;
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }

}