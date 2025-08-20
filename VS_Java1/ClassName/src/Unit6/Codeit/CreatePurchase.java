package Unit6.Codeit;

import java.util.*;

public class CreatePurchase {
    public static void main(String[] args) {
        Purchase purch = new Purchase();
        Scanner input = new Scanner(System.in);
        int num;
        double amount;
        final int LOW = 1000, HIGH = 8000;
        System.out.print("Enter invoice number >> ");
        num = input.nextInt();

        while (num < LOW || num > HIGH) {
            System.out.println("Invoice number must be between 1,000 and 8,000 inclusive.");
            System.out.print("Enter invoice number >> ");
            num = input.nextInt();
        }

        purch.setInvoiceNumber(num);

        // Prompt for sale amount
        System.out.print("Enter sale amount >> ");
        amount = input.nextDouble();

        while (amount < 0) {
            System.out.println("Sale amount must be nonnegative.");
            System.out.print("Enter sale amount >> ");
            amount = input.nextDouble();
        }

        purch.setSaleAmount(amount);

        // Display purchase details
        System.out.println("Invoice #" + purch.getInvoiceNumber() +
                "  Amount of sale: $" + purch.getSaleAmount() +
                "  Tax: $" + purch.getTax());
    }
}
