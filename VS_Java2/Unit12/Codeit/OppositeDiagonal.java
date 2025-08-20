package Unit12.Codeit;

import java.util.*;
public class OppositeDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines;
        System.out.print("How many lines to display? >> ");
        lines = input.nextInt();
        display(lines, lines);   
    }
    public static void display(int spaces, int lines)
    {
        if(lines == 0)
            return;
        else
            {
                spaces--;
                for(int x =0; x < spaces; ++x)
                    System.out.print(" ");
                System.out.println("O");
                display(spaces, lines - 1);
            }
    }

}
