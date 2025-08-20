package GeMetrixTesting;

public class testing9 {
    static String region;
    static Integer sales;
    static Double bonus;

    public static void main(String[] args) {
        if (region.equals("North")) {
            if (sales > 50000) {
                bonus = .05;
            } else if (sales > 40000) {
                bonus = .05;
            } else {
                bonus = .00;
            }
        }
    }
}
