package Unit4.Practice.CompositionAndNested.NestedClasses;

public class RealEstateListing 
{
    private int listingNumber;
    private double price;
    private HouseData houseData;
    public RealEstateListing(int num, double price, String address,
    int sqFt)
    {
        listingNumber = num;
        this.price = price;
        houseData = new HouseData(address, sqFt);
    }

    public void display()
    {
        System.out.println("Listing nuymber #" + listingNumber +
        " Selling for $" + price);
        System.out.println("Address: " + houseData.streetAddress);
        System.out.println(houseData.squareFeet + " square feet");
    }

    private class HouseData // this is an inner class
    {
        private String streetAddress;
        private int squareFeet;
        public HouseData(String address, int sqFt)
        {
            streetAddress = address;
            squareFeet = sqFt;
        }
    }
}
