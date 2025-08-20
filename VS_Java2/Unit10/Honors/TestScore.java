package Unit10.Honors;

// Programmer Kevin Murillo
// Program 10-8 Honors

import java.util.*;

public class TestScore {

    public static void main(String[] args) {
        int[] studentIDs = {1234, 2345, 3456, 4567, 5678};
        int[] scores = new int[studentIDs.length];
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentIDs.length; i++) {
            int score = 0;
            
            System.out.print("Enter score for student id number: " + studentIDs[i] + " >> ");
            
            try {
                String input = scanner.nextLine();
                score = Integer.parseInt(input);
                
                if (score > 100) {
                    throw new ScoreException("Score cannot be greater than 100");
                }
                
            } catch (NumberFormatException error) {
                System.out.println("Score must be an integer - will be 0");
                score = 0; 
            } catch (ScoreException error) {
                System.out.println(error.getMessage() + " - will be 0");
                score = 0; 
            }

            scores[i] = score;
        }

        System.out.println("\nStudent scores:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("ID #" + studentIDs[i] + "  Score " + scores[i]);
        }
    }
}
