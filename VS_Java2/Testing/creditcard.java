package GeMetrixTesting;

public class creditcard {
    public static void main(String[] args) {

        int qty = 10;
        double discount;
        String customerStatus = "Platinum";

        if (customerStatus.equals("Platinum")) {
            if (qty >= 10) {
                discount = .10;
                System.out.println(qty + discount + customerStatus);
            }
        } else if (customerStatus.equals("Silver")) {
            if (qty >= 10) {
                discount = .05;
                System.out.println(qty + discount + customerStatus);
            } else {
                discount = .02;
                System.out.println(qty + discount + customerStatus);
            }
        } else
            discount = 0;
        System.out.println(qty + customerStatus);

    }

}
