package Unit13.CodeIt;

// Kevin Murillo
// Part B

import java.util.*;

public class ApartmentsLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Apartment> apartments = new LinkedList<>();

        // Input loop
        while (true) {
            System.out.print("Enter street address for apartment or ZZZ to quit >> ");
            String streetAddress = scanner.nextLine();
            if (streetAddress.equalsIgnoreCase("ZZZ")) {
                break;
            }
            System.out.print("Enter apartment number >> ");
            String aptNumber = scanner.nextLine();
            System.out.print("Enter rent >> ");
            double rent = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter number of bedrooms >> ");
            int bedrooms = Integer.parseInt(scanner.nextLine());
            //scanner.nextLine(); // Consume newline
            apartments.add(new Apartment(streetAddress, aptNumber, rent, bedrooms));
        }

        // Sort the apartments by rent value
        apartments.sort(null);

        // Display the sorted list
        System.out.println();
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }
}