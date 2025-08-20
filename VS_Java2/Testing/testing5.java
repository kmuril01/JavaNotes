package GeMetrixTesting;

import java.util.*;

public class testing5 {

    public static void main(String[] args) {
        String region = "";
        int a = 20;
        int b = 3;

        double amount = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);

        System.out.println(region.isEmpty());
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(a / b);
        System.out.println(amount * rate);
        try {
Scanner scanner = new Scanner("1 Red 2 Blue 3 Green 4 Yellow 5 Silver");
Object res1 = scanner.next();
Object res2 = scanner.nextInt();
Object res3 = scanner.next();
}
catch (Exception ex) {
System.out.println(ex.getMessage());
}
finally
{
System.out.println("Thank you for using the scanner.");
}


}
    }

}
