/*
 * The program in Figure 4-7 assumes that the Employee.java
 *  file is stored in the same folder as the application.
 *  If the Employee.java file was stored in a different folder, 
 * you would need an import statement at the top of the file, 
 * similar to the ones you use for the Scanner and JOptionPane 
 * classes.
 */


package Unit4.Practice.Chapter1Thru6;

public class DeclareTwoEmployee 
{
    public static void main(String[] args) 
    {
        Employee clerk = new Employee();
        Employee driver = new Employee();
        clerk.setEmpNum(345);
        driver.setEmpNum(567);
        System.out.println("The clerk's number is " + clerk.getEmpNum() + 
        " and the driver's number is " + driver.getEmpNum());
    }    
}
