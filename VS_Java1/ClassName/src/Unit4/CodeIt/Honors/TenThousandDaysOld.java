package Unit4.CodeIt.Honors;

import java.time.LocalDate;
import java.util.Scanner;

public class TenThousandDaysOld {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int birthMonth;
        int birthDay;
        int birthYear;
        
        
        System.out.println("Enter your birth month as an integer >> ");
        birthMonth = kb.nextInt();
        System.out.println("Enter your birth day as an integer >> ");
        birthDay = kb.nextInt();
        System.out.println("Enter you birth year as a four-digit integer >> ");
        birthYear = kb.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        LocalDate tenThousandDaysLater = birthDate.plusDays(10000);

        System.out.println("You are 10000 days old on " + tenThousandDaysLater);
    }
    
}
