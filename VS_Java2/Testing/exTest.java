package GeMetrixTesting;

import java.util.*;

class exTest {
    public static void main(String args[]) {
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Gold");
        levels.add("Silver");
        levels.add("Bronze");
        levels.add("Platium");

        Iterator levelsList = levels.iterator();
        while (levelsList.hasNext()) {
            System.out.println(levelsList.next());
        }

    }
}
