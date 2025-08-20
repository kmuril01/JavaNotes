package Unit9.HonorsExercise;

import java.util.Scanner;

public class DemoPhoneCalls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneCall call;  

        while (true) {
            System.out.print("Is this call (I)ncoming or (O)utgoing?\nOr enter Q to quit >> ");
            String choice = scanner.nextLine().toUpperCase();  
            
            if (choice.equals("Q")) {
                System.out.println("Exiting program.");
                break;  
            }

            System.out.print("Enter the phone number >> ");
            String phoneNumber = scanner.nextLine();

            if (choice.equals("I")) {

                call = new IncomingPhoneCall(phoneNumber);
            } else if (choice.equals("O")) {

                System.out.print("Enter minutes >> ");
                int minutes = Integer.parseInt(scanner.nextLine());
                call = new OutgoingPhoneCall(phoneNumber, minutes);
            } else {
                System.out.println("Invalid input. Please enter 'I' for incoming, 'O' for outgoing, or 'Q' to quit.");
                continue; 
            }

            call.displayCallInfo();
        }

        scanner.close();
    }
}
