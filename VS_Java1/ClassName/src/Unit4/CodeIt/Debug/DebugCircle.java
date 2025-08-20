package Unit4.CodeIt.Debug;

public class DebugCircle
{
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;
    public DebugCircle() {}; // Do not remove this line
    public DebugCircle(int r)
    {
       radius = r;
       diameter = 2 * r;
       area = PI * r * r;
    }

    public void setRadius(int rad)
    {
        radius = rad;
    }
    public void setDiameter(int dia)
    {
        diameter = dia;
    }
    public void setArea(double ara)
    {
        area = ara;
    }
    
    public int getRadius()
    {
       return radius;
    }
    public int getDiameter()
    {
       return diameter;
    }
    public double getArea()
    {
       return area;
    }

 }