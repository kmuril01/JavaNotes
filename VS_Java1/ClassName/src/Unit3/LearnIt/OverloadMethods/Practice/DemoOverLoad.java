package Unit3.LearnIt.OverloadMethods.Practice;

public class DemoOverLoad 
{
    public static void main(String[] args)
    {
        int month = 6, day = 24, year = 2023;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }
    public static void displayDate(int mm) //first overload
    {
        System.out.println("Event date " + mm + "/1/2024"); //the month will be the same as declared in main
    }
    public static void displayDate(int mm, int dd) //second overload
    {
        System.out.println("Event date " + mm + "/" + dd + "/2024"); //the month and day will be the same as declared in main
    }
    public static void displayDate(int mm, int dd, int yy) //thirs overload
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy); //the month, day, year will be the same as declared in main
    }

    /* In this section, you overload methods to display dates. The
     * date-displaying methods might be used by many different applications
     * in an organization, such as those that schedule jobs, appointments, 
     * and employee reviews. The methods take one, two, or three integer 
     * arguments. If there is one argument, it is the month, and the date 
     * becomes the first day of the given month in the year 2024. If there 
     * are two arguments, they are the month and the day in the year 2024. 
     * Three arguments represent the month, day, and year. */
}
