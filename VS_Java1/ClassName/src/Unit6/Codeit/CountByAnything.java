package Unit6.Codeit;

import java.util.Scanner;

public class CountByAnything {

        public static void main(String[] args) {
            final int start;
            final int STOP = 500;
            final int NUMBER_PER_LINE = 10;

            Scanner kb = new Scanner(System.in);
            System.out.print("Enter number to count by >> ");
            start = kb.nextInt();

            for(int i = start; i <= STOP; i += start)
            {
             System.out.print(i + "  ");
                if(i % NUMBER_PER_LINE == 0)
                    System.out.println();
            }
        }
    
}
