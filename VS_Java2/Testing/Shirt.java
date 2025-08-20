package GeMetrixTesting;

public class Shirt {
    String size;
    String sleeve;
    String color;

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("XL", "Long", "Blue");
        System.out.println(shirt1.color);
    }

    public Shirt(String size, String sleeve, String color) {
        this.size = size;
        this.sleeve = sleeve;
        this.color = color;
    }

}
