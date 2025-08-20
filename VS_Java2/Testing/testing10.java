package GeMetrixTesting;

public class testing10 {
    public String practiceHoursString(int initHours) {
        String msgHours;
        if (initHours >= 20) {
            msgHours = "Well practiced";
        } else {
            msgHours = "Need more practice";
        }
        return msgHours;
    }

    public static String practiceHours(double partialHours) {
        String msgHours;
        if (partialHours >= 20.5) {
            msgHours = "Well practiced";
        } else {
            msgHours = "Need more practice";
        }
        return msgHours;
    }
}
