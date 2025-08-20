package GeMetrixTesting;

public class OrderTotal {

    public static double orderTotal(int qty, double price) {
        double amount;
        if (status == "Gold") {
            amount = qty * price * .9;
        } else {
            amount = qty * price;
        }
        return amount;
    }
}
