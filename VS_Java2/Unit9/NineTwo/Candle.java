package Unit9.NineTwo;

// Programmer Kevin Murillo
// Programming exercise 9-2 Part A

public class Candle {
    private String color;
    private int height;
    protected double price;

    public String getColor()
    {
     return color;   
    }

    public int getHeight()
    {
        return height;
    }

    public double getPrice()
    {
        return price;
    }

    public void setColor(String clr)
    {
        color = clr;
    }

    public void setHeight(int ht)
    {
        final double PER_INCH = 2;
        height = ht;
        price = height * PER_INCH;
    }
}

