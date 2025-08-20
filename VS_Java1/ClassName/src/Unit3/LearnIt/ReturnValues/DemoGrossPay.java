package Unit3.LearnIt.ReturnValues;

public class DemoGrossPay 
{
public static void main(String[] args) 
{
    double hours = 25;
    double yourHoursWorked = 37.5;
    // The calculateGross() method is called three times using three different args
    calculateGross(10);
    calculateGross(hours);
    calculateGross(yourHoursWorked);
    
} 
//Single value passing into the method 
//"hours" Each time the method is called the parameter hours receives a copy of the vale that was passed
public static void calculateGross(double hours) 
{
    final double STD_RATE = 22.75;
    double gross;
    gross = hours * STD_RATE;
    System.out.println(hours + " hours at $" +
    STD_RATE + " per hour is $" + gross);
}   
}
