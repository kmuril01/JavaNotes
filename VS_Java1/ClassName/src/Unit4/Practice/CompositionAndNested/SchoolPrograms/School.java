package Unit4.Practice.CompositionAndNested.SchoolPrograms;

public class School 
{
    private NameAndAddress nameAdd; //this statement declares a object named NameAndAddress
    private int enrollment;
    public School(String name, String add, int zip, int enrolled)
    {
        nameAdd = new NameAndAddress(name, add, zip); //this statement calls the constructor in the NameandAddress class
        enrollment = enrolled;
    }    
    public void display()
    {
        System.out.println("The school information:");
        nameAdd.display(); //this statment calls the disply() method in NameAndAdress class
        System.out.println("Enrollment is " + enrollment);
    }
}
