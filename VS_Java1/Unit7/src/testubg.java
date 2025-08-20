import java.util.*;
public class testubg {

    private static int count = 0; // Declare count outside the method to retain its value between calls

    public static void main(String[] args) {
        int customer, color;
        
        for(customer = 1; customer <= 20; ++customer) {
            for(color = 1; color <= 3; ++color) {
                outputLabel(); // Call outputLabel method
            }
        }
    }

    private static void outputLabel() {
        count++; // Increment count with each call
        System.out.println("count: " + count); // Print count along with the label
    }
}
