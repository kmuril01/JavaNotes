package Unit4.Practice.ImpPreWrittenConstAndMethods;

import java.time.*;

public class LocalDateDemo
{
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();
        LocalDate graduationDate = LocalDate.of(2024, 5, 29);
        LocalDate graduationDay = LocalDate.of(2024, 05, 29);
        LocalDate annualMeeting = LocalDate.of(2023, Month.OCTOBER, 1);
        System.out.println("Today is " + today);
        System.out.println("Gradudation is " + graduationDate);

        System.out.println("Graduation will be on day " + 
        graduationDate.getDayOfMonth() + " in month " + 
        graduationDay.getMonthValue());

        System.out.println("Graduation is on " + graduationDate.getDayOfWeek());

        System.out.println("The annual meeting is " + annualMeeting.getMonth() + " " +
        annualMeeting.getDayOfMonth() + ", " + annualMeeting.getYear());

    }
}
