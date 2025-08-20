package Unit4.CodeIt.PartFourDotOne;

public class Sandwich {

    private String mainIngredient;
    private String bread;
    private double price;

    public void setMainIngredient(String ingredient)
    {
        mainIngredient = ingredient;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }

    public void setBread(String breadType)
    {
        bread = breadType;
    }

    public String getBread()
    {
        return bread;
    }

    public void setPrice(double amt)
    {
        price = amt;
    }

    public double getPrice()
    {
        return price;
    }
}
