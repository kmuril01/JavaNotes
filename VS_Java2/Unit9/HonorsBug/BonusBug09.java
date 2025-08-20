package Unit9.HonorsBug;

// File Name – BonusBug09.java
// Inheritance Demo Example 

public class BonusBug09
{
  public static void main(String[] args)
  {
   DebugMasterCourse course = new DebugMasterCourse();
   DebugSection newsection = new DebugSection();

   course.setCourseId("COSC 1436");
   course.setCourseName("Programming I");
   
   newsection.setCourseId("COSC 2437)");
   newsection.setSection("C++ Section");

   System.out.println(course.getMasterCourse());
   System.out.println(newsection.getSection());
  }
}