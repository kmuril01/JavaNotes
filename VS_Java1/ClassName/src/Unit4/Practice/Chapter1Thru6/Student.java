/* 
 * Using "this" as a reference in Unit 4.7
 * 
 * Class that instantiates a Student object is in TestStudent
 * 
 */

package Unit4.Practice.Chapter1Thru6;

public class Student 
{

    private int stuNum; //These are the Student fields.
    private double gpa; //These are the Student fields.

    public Student(int stuNum, double gpa) //stuNum, gpa (These parameters are locally declared in the Student constructor)
    {
        /* 
        * "this" Because these identifiers are preceded by thhis. they refer to the fields in the Student Class.
         * These identifiers, without this, refer to the locally declared variables and not the fields.
         */
        this.stuNum = stuNum;
        this.gpa = gpa;

        /* 
         * Don't do this!
         * {
         *  stuNum = stuNum; //all four variables used in these two statements are the local versions declared
         *                   //in the constructor's parameter list. The feilds are never accessed because the
         *                   //local variables shadow the fields. These two assignment statements accomplish nothing.
         *  gpa = gpa;
         * }
         */
    }

    public void showStudent()
    {
        System.out.println("Student #" +
        /*
         * The showStudent() method has no locaaly declared variables, so these identifiers
         * refer to the student fields
         */
        stuNum + " gpa is " + gpa); 
    }
}
