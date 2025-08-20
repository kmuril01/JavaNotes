package GeMetrixTesting;

public class testing2 {
    static int bonus = 30;
    static int score = 0;
    static String match = "";

    public static void main(String args[]) {
        score = 220;
        match = "Win";
        runMatch(score);
        System.out.println(score);
    }

    public static int runMatch(int gameScore) {
        int updatedScore = 0;
        if (match.equals("Win")) {
            updatedScore = score + bonus;
        } else {
            updatedScore = gameScore;
        }
        score = updatedScore;
        return updatedScore;
    }
}
