package Unit12.Codeit;

import java.util.*;

public class MultiplicationByAdding {

    public static void main(String[] args) {
        
    
    Scanner kb = new Scanner(System.in);
    int x;
    int y;
    int product;

    System.out.print("Enter an integer >>");
    x = kb.nextInt();
    System.out.print("Enter another integer >>");
    y = kb.nextInt();
    product = multiplication(x, y);
    System.out.println(x + " * " + y + " = " + product);
    }

    public static int multiplication(int x, int y)
    {
        if(x == 0)
            return 0;
        else
            return (y + multiplication(x - 1, y));
    }
}