package Unit13.Honors;

import java.util.ArrayList;
import java.util.Scanner;

public class BonusBug13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Create an original playlist using ArrayList
        ArrayList<String> artists = new ArrayList<>();

        // Adding artists to the playlist
        System.out.println("Add your favorite artists to the playlist, enter ZZZ to stop: ");
        String input;
        while (true) {
            input = kb.nextLine();
            if (input.equalsIgnoreCase("ZZZ")) {
                break;
            }
            artists.add(input);
        }

        // Displaying the original playlist
        System.out.println("Original Artist PlayList: " + artists);

        // Updating an artist in the playlist
        if (artists.size() > 2) {
            artists.set(2, "Taylor's Version");
        }
        System.out.println("Modified Artist PlayList: " + artists);

        // Removing an artist from the playlist
        if (artists.size() > 3) {
            String removedArtist = artists.remove(3);
            System.out.println("Updated PlayList: " + artists);
            System.out.println("Removed Artist: " + removedArtist);
        } else {
            System.out.println("Not enough artists to remove one at index 3.");
        }
    }
}
