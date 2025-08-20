package Unit3.LearnIt.ReturnValues;

public class DemoGrossPayMulti 
{
public static void main(String[] args) 
{
    //calculateGross(25,10) passes through to the call method
    calculateGross(25,22.75);
    
} 

//creating a method that requires multiple parameters
public static void calculateGross(double hours, double rate) 
{
    double gross;
    gross = hours * rate;
    System.out.println(hours + " hours at $" +
    rate + " per hour is $" + gross);
}   
}
