package GeMetrixTesting;

public class CircleArea {
    private static double radius;
    public static double circumference;

    public static void main(String args[]) {
        System.out.println(CalcArea(10.0));
        System.out.println(circumference);
    }

    public static double CalcArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static double CalcCircumference(double radius) {
        circumference = radius * 2 * Math.PI;
        return circumference;
    }

    public class CircleCircumference {

    }

}
