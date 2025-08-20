package Unit4.Practice.Chapter1Thru6;

/* Figure 4-4
 * shows a typical class that would be used to declare
 * an Employee class containing one private data field 
 * and two public methods, all of which are nonstatic. 
 * This class becomes the model for a new data type 
 * named Employee; when Employee objects eventually 
 * are created, each will have its own empNum field, 
 * and each will have access to two methods—one that 
 * provides a value for its empNum field and another 
 * that retrieves the value stored there.
 *  
 *    public class Employee
 *      {
 *        private int empNum;
 *        public int getEmpNum()
 *          {
 *              return empNum;
 *          }
 *        public void setEmpNum(int emp)
 *          {
 *              empNum = emp;
 *          }
 *      }
 * 
 * Figure 4-5
 * Most classes that you create have multiple data 
 * fields and methods. For example, in addition to 
 * requiring an employee number, an Employee needs 
 * a last name, a first name, and a salary, as well 
 * as methods to set and get those fields. Figure 4-5 
 * shows one way you could arrange the data fields 
 * for the Employee class.
 * 
 *  public class Employee 
 *      {
 *          private int empNum;
 *          private String empLastName;
 *          private String empFirstName;
 *          private double empSalary;
 *          //method will go here
 *      }
 * 
 */

//Figure 4-6

public class Employee 
{
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    
    /*
     * The "this" reference is sent into
     * this nonstatic method as a parameter
     * automatically; you do not (and cannot)
     * wrtie code for it. You do not need to use
     * "this" with empNum
     */
    public int getEmpNum() 
    {
        return empNum;
        // return this.empNum;
        /*
         * However you can explicity use "this" reference
         * with empNum. The two methods operate identically
         */
    }

    public void setEmpNum(int emp)
    {
        empNum = emp;
    }

    public String getEmpLastName()
    {
        return empLastName;
    }
    public void setEmpLastName(String name)
    {
        empLastName = name;
    }

    public String getEmpFirstName()
    {
        return empFirstName;
    }
    public void setEmpFirstName(String name)
    {
        empFirstName = name;
    }
    
    public double getEmpSalary()
    {
        return empSalary;
    }
    public void setEmpSalary(double sal)
    {
        empSalary = sal;
    }
}
