package Unit4.Practice.Chapter1Thru6;

public class SpaService 
{
    private String serviceDescription;
    private double price; 

    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }

    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }

    public String getServiceDescription()
    {
        return serviceDescription;
    }

    public double getPrice()
    {
        return price;
    }

    public static void main(String[] args) 
    {
       
    }    

    public SpaService() //this is a contructor passed through any class that uses it
    {
        //he parameterless constructor now calls the one that requires parameters.
        this("XXX",0);
        //serviceDescription = "XXX";
        //price = 0;
    }

    public SpaService(String desc, double pr) //this is to overload the constructor and it is parameterless
    {
        serviceDescription = desc;
        price = pr;
    }
}
