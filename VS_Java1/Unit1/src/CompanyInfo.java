public class CompanyInfo 
{
    public static void main(String[] args)
    {
        System.out.println("Smart Electronics");
        displayHours(); // This method call invokes the method below noted by & "client/calling method"
    }
    public static void displayHours() // & this is the display method invoked above "called method"
    {
        System.out.println("Monday-Friday 8 am to 6 pm");
        System.out.println("Saturday      8 am to noon");
        System.out.println("Sunday        closed");
    }
}
