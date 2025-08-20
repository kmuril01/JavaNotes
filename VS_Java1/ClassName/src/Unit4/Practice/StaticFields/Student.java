/* 
 * Using "Constant Fields in Unit 4.8
 * 
 *
 * 
 */

package Unit4.Practice.StaticFields;

public class Student 
{

    private static final int SCHOOL_ID = 12345; //static final symbolic constant
    private int stuNum;
    private double gpa; 

    public Student(int stuNum, double gpa)
    {
        this.stuNum = stuNum;
        this.gpa = gpa;
    }

    public void showStudent()
    {
        System.out.println("Student #" +
        stuNum + " gpa is " + gpa); 
    }
}
