package GeMetrixTesting;

public class ex411 {

    public static void main(String args[]) {

        Product prod1 = new Product(1, "Teat", "Green Tea", 8.99);
        System.out.println("Our first team us " + prod1.prodName + ".");

    }

    class Product {
        int prodID;
        String type;
        String prodName;
        double print;
    }
}
