package Unit5.CodeIt.FiveTwo;


//Programmer Kevin Murillo
//Program Unit 5-3

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args)
    {
        int num1, num2, num3;
        int low, med, high;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an intger... ");
        num1 = kb.nextInt();
        System.out.print("And another... ");
        num2 = kb.nextInt();
        System.out.print("And just one more... ");
        num3 = kb.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            low = num1;
            if (num2 <= num3) {
                med = num2;
                high = num3;
            } else {
                med = num3;
                high = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            low = num2;
            if (num1 <= num3) {
                med = num1;
                high = num3;
            } else {
                med = num3;
                high = num1;
            }
        } else {
            low = num3;
            if (num1 <= num2) {
                med = num1;
                high = num2;
            } else {
                med = num2;
                high = num1;
            }
        }

        System.out.println("Ascending: " + low + " " + med + " " + high);
        System.out.println("Descending: " + high + " " + med + " " + low);
    }
}
