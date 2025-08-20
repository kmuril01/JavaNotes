package Unit13.CodeIt;

// Kevin Murillo
// Part C

import java.util.*;

public class ApartmentsLinkedList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Apartment> apartments = new LinkedList<>();

        System.out.print("Enter street address for apartment or ZZZ to quit >> ");
        String address = scanner.nextLine();

        while (!address.equals("ZZZ")) {
            System.out.print("Enter apartment number >> ");
            String aptNumber = scanner.nextLine();
            System.out.print("Enter rent >> ");
            double rent = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter number of bedrooms >> ");
            int bedrooms = Integer.parseInt(scanner.nextLine());

            apartments.add(new Apartment(address, aptNumber, rent, bedrooms));

            System.out.print("Enter street address for apartment or ZZZ to quit >> ");
            address = scanner.nextLine();
        }

        Collections.sort(apartments);

        System.out.println("\nList of apartments");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }

        System.out.print("\nEnter address to remove >> ");
        String addressToRemove = scanner.nextLine();

        Iterator<Apartment> iterator = apartments.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAddress().equals(addressToRemove)) {
                iterator.remove();
            }
        }

        System.out.println("\nList of apartments");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }
    }
}