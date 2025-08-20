package Unit9.NineTwo;

// Programmer Kevin Murillo
// Programming exercise 9-2 Part C

import java.util.*;

public class DemoCandles {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);

        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();

        String[] scents = {"gardenia", "beach", "pine", "carnation"};
        String color;
        int inches;
        String scent;
        int x;

        System.out.print("Enter a color for the candle >> ");
        color = kb.nextLine();

        System.out.print("Enter a height in a whole of inches >> ");
        inches = kb.nextInt();
        kb.nextLine();

        aCandle.setColor(color);
        aCandle.setHeight(inches);

        System.out.print("Enter a color for the scented candle >> ");
        color = kb.nextLine();

        System.out.print("Enter a height in a whole of inches >> ");
        inches = kb.nextInt();
        kb.nextLine();

        System.out.print("Enter a scent. Choose from the following:");
        for(x = 0; x < scents.length; ++x)
        {
            System.out.print(scents[x]);
            if(x < scents.length - 1)
                System.out.print(", ");
        }
        System.out.print("     >> ");
        scent = kb.nextLine();

        aScentedCandle.setColor(color);
        aScentedCandle.setScent(scent);
        aScentedCandle.setHeight(inches);

        System.out.println("The " + aCandle.getHeight() +
        " inch " + aCandle.getColor() +
        " candle costs $" + aCandle.getPrice());

        System.out.println("The " + aScentedCandle.getHeight() + 
        " inch " + aScentedCandle.getScent() +
        " " + aScentedCandle.getColor() +
        " candle costs $" + aScentedCandle.getPrice());
    }
}
