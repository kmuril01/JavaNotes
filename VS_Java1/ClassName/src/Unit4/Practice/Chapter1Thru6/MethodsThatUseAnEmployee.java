package Unit4.Practice.Chapter1Thru6;

import java.util.Scanner;

public class MethodsThatUseAnEmployee 
{
    public static void main(String[] args) {
        Employee mEmployee; //Employee is declared
        mEmployee = getEmployeeData(); //Value return from getEmployeeData() method is assigned to myEmployee object
        displayEmployee(mEmployee); //myEmployee object is passed to the displayEmployee() method
    }

    public static Employee getEmployeeData() //Return type is employee
    {
        Employee tempEmp = new Employee();
        int id;
        double sal;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter employee ID >> ");
        id = kb.nextInt();
        tempEmp.setEmpNum(id);
        System.out.print("Enter employee salary >> ");
        sal = kb.nextDouble();
        tempEmp.setEmpSalary(sal);
        return tempEmp; //Employee object is returned
    }

    public static void displayEmployee(Employee anEmp) //Parameter is Employee Type
    {
        System.out.println("\nEmployee #" + anEmp.getEmpNum() +
        " Salary is " + anEmp.getEmpSalary());
    }
}
