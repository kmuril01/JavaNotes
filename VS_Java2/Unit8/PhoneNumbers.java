package Unit8;

import java.util.*;

public class PhoneNumbers {
    public static void main(String[] args) {
        String[] names = new String[30];
        String[] phoneNumbers = new String[30];
        names[0] = "Alice"; phoneNumbers[0] = "(123) 456-7890";
        names[1] = "Bob"; phoneNumbers[1] = "(234) 567-8901";
        names[2] = "Charlie"; phoneNumbers[2] = "(345) 678-9012";
        names[3] = "David"; phoneNumbers[3] = "(456) 789-0123";
        names[4] = "Eve"; phoneNumbers[4] = "(567) 890-1234";
        names[5] = "Frank"; phoneNumbers[5] = "(678) 901-2345";
        names[6] = "Grace"; phoneNumbers[6] = "(789) 012-3456";
        names[7] = "Heidi"; phoneNumbers[7] = "(890) 123-4567";
        names[8] = "Ivan"; phoneNumbers[8] = "(901) 234-5678";
        names[9] = "Judy"; phoneNumbers[9] = "(012) 345-6789";

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int currentIndex = 10;  
        while (true) {
            System.out.print("Enter name to look up. Type 'quit' to quit. >> ");
            String inputName = scanner.nextLine();
            if (inputName.equalsIgnoreCase("quit")){
                break;
            }
            boolean found = false;
            for (int i = 0; i < currentIndex; i++) {
                if (names[i].equalsIgnoreCase(inputName)) {
                    System.out.println(inputName + "'s phone number is " + phoneNumbers[i]);
                    found = true;
                }
            }

            if (!found) {
                if (currentIndex < 30) {
                    System.out.println(inputName + " not found in current list");
                    System.out.print("Enter phone number for " + inputName + " >> ");
                    String inputPhoneNumber = scanner.nextLine();
                    names[currentIndex] = inputName;
                    phoneNumbers[currentIndex] = inputPhoneNumber;
                    currentIndex++;
                } else {
                    System.out.println("Phone directory is full. Cannot add more entries.");
                }
            }
        }
    }
}
