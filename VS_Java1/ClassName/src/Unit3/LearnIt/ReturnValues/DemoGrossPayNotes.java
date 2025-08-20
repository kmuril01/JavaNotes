package Unit3.LearnIt.ReturnValues;

public class DemoGrossPayNotes 
{
public static void main(String[] args) 
{
    //calculateGross(25,10) passes through to the call method
    calculateGross(25,22.75);    
    
} 
    //Notes: from notebook
    
    //Different types of method types examples;
    //Method that returns no value so it is void
        //public static void displayHours()
    //Method that returns an int
        //public static int getAge()
    //Method that returns as boolean
        //public static boolean didWorkOvertime()
    
//creating a method that requires multiple parameters
public static double calculateGross(double hours, double rate) 
{
    double gross;
    gross = hours * rate;
    return gross;
}   

}
