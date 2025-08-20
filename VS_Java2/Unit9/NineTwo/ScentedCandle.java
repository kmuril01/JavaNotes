package Unit9.NineTwo;

// Programmer Kevin Murillo
// Programming exercise 9-2 Part B

public class ScentedCandle extends Candle {

    private String scent;

    public String getScent()
    {
        return scent;
    }

    public void setScent(String scent)
    {
        this.scent = scent;
    }

    @Override
    public void setHeight(int ht)
    {
        final double PER_INCH = 3;
        super.setHeight(ht);
        price = ht * PER_INCH;
    }

}