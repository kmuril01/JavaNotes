package GeMetrixTesting;

public class carTotal {

    public static void main(String[] args) {
        int amount = 29000;
        double tax = .06;
        int licensing = 1000;
        int subtotal = amount + licensing;
        double total = subtotal * tax + subtotal;

        System.out.print("Your total amount after taxes and licensing is " + total);
    }
}
