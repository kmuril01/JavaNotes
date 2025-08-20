package GeMetrixTesting;

public class testing14 {

    public static void main(String[] args) {
        String s1 = "bookworm";
        String s2 = "Bookworm";
        String s3 = new String("Bookworm");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2 != s1);
    }

}
