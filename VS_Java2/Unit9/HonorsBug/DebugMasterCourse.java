package Unit9.HonorsBug;

// File Name – DebugMasterCourse.java

public class DebugMasterCourse
{
    private String courseID;
    private String courseName;
 
    public void setCourseId(String couID)
    {
       courseID = couID;
     }
     public void setCourseName(String couName)
    {
       courseName = couName;
     }
    public String getMasterCourse() 
    {
     return courseID + "--" + courseName + " is offered this semester as ";
    }		
 }
