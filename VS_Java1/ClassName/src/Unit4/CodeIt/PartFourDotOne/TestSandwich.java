package Unit4.CodeIt.PartFourDotOne;

import java.util.Scanner;

public class TestSandwich {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        Sandwich sandwich = new Sandwich();
        String ingredient;
        String bread;
        double price;
        
        System.out.println("Enter main sandwich ingredient >> ");
        ingredient = kb.nextLine();
        System.out.println("Enter bread type >> ");
        bread = kb.nextLine();
        System.out.println("Enter sandwich price >> ");
        price = kb.nextDouble();

        sandwich.setMainIngredient(ingredient);
        sandwich.setBread(bread);
        sandwich.setPrice(price);

        System.out.println("You have ordered a " + 
        sandwich.getMainIngredient() + " sandwish on " + 
        sandwich.getBread() + " bread, and the price is " + 
        sandwich.getPrice());

    }

}
