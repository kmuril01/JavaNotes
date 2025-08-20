package Unit13.CodeIt;

import java.util.*;

public class RemoveNumber {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner kb = new Scanner(System.in);
        String QUIT = "ZZZ";
        int eliNUM;
        Integer elim;
        boolean done = false;
        String in = "";

        System.out.println("Enter integers or ZZZ to stop:");
        in = kb.nextLine();
        while (!in.equals(QUIT)) {
            numbers.add(Integer.valueOf(in));
            in = kb.nextLine();
        }

        Iterator<Integer> iter = numbers.iterator();
        System.out.println("Numbers:");
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println(in);

        System.out.print("Enter a number to eliminate >> ");
        eliNUM = kb.nextInt();
        elim = eliNUM;
        iter = numbers.iterator();

        while (!done && iter.hasNext()) {
            if (elim.equals(iter.next())) {
                iter.remove();
                done = true;
            }
        }

        iter = numbers.iterator();
        System.out.println("Numbers:");
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println();
    }

}
