package Unit3.LearnIt;

import java.util.Scanner;

public class CalculateAreaWithMethods 
{
    public static void main(String[] args) 
    {
     double radius = getRadius();
     double area = caculateArea(radius);
     outputArea(radius, area);   
    }

    public static double getRadius()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the radius of your circle >> ");
        double r = keyboard.nextDouble();

        return r;
    }

    public static double caculateArea(double r)
    {
        final double PI = 3.14159;
        double circleArea = PI * r * r;
        
        return circleArea;
    }

    public static void outputArea(double r, double a)
    {
        System.out.print("If the radius of the circle is " + r);
        System.out.println(", the area is "+ a);
    }
}
