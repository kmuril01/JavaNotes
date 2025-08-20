package Unit5.CodeIt.FiveEight;

import java.util.Scanner;

public class TestAutomobiles {

    public static void main(String[] args) {
        Automobile auto1, auto2;
        auto1 = enterData();
        auto2 = enterData();
        System.out.println("\nFirst Automobile:");
        displayAutoDetails(auto1);
        System.out.println("\nSecond Automobile:");
        displayAutoDetails(auto2);
    }

    public static Automobile enterData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID (an integer) >> ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter make >> ");
        String make = scanner.nextLine();
        System.out.print("Enter model >> ");
        String model = scanner.nextLine();
        System.out.print("Enter color >> ");
        String color = scanner.nextLine();
        System.out.print("Enter year (4 digits) >> ");
        int year = scanner.nextInt();
        System.out.print("Enter mpg >> ");
        int mpg = scanner.nextInt();
        return new Automobile(id, make, model, color, year, mpg);
    }

    public static void displayAutoDetails(Automobile auto) {
        System.out.println("ID#" + auto.getId() + " " + auto.getMake() + " " + auto.getModel() + " " +
                auto.getColor() + " " + auto.getYear() + " " + auto.getMpg() + " miles per gallon");
    }
}

