package Unit4.CodeIt.Debug;

import java.util.Scanner;

public class DebugFour1 {
       public static void main(String args[])
   
    {
        Scanner input = new Scanner(System.in);
        int radius;
        int diameter;
        double area;

        DebugCircle c;
        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();
        c = new DebugCircle(radius);
        System.out.println("The radius is " + c.getRadius());
        System.out.println("The diamter is " + c.getDiameter());
        System.out.println("The area is " + c.getArea());
     }
    }
