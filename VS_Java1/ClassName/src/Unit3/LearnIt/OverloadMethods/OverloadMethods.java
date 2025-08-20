package Unit3.LearnIt.OverloadMethods;

public class OverloadMethods 
{
    public static void main(String[] args) 
    {
        caculateInterest(1000.00,0.04);
        calculateInterestdiffArg(1000.00, 4);

    }
    public static void caculateInterest(double bal, double rate)
    {
        double interest;
        interest = bal * rate;
        System.out.println("Simple interest on $" + bal +
        " at " + rate + "% rate is " + interest);
    }
    /*Example if you want to overload a method
     * this is assuming that different user want to calculate interest using different argument types.
     * For example some user want to use 0.04 and other might want to use 4 assuming that both mean
     * a rate 4%
    */
    public static void calculateInterestdiffArg(double bal, int rate) //Notice the type for rate
    {
        double interest, rateAsPercent;
        rateAsPercent = rate / 100.0; //dividing by 100.0 coverts the rate to its percent equivalent.
        interest = bal * rateAsPercent;
        System.out.println("Simple interest on $" + bal + 
        " at " + rate + "% rate is " +
        interest);
    }
    /* Question Answer: Overloading methods is preferable to using unique identifiers
     * because it is convenient for programmers to use one reasonable name for tasks 
     * that are functionally identical, except for the argument types that can be 
     * passed to them. */
}
