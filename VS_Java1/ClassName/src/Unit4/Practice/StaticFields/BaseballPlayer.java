package Unit4.Practice.StaticFields;

public class BaseballPlayer 
{
    private static int countOfPlayers = 0; //this field is satic; all objects of the type Baseballplayer will share it's value
    private int number;
    private double battingAverage;
    public BaseballPlayer(int id, double avg)
    {
        number = id;
        battingAverage = avg;
        countOfPlayers = countOfPlayers + 1;
    }    

    public void showPlayer()
    {
        System.out.println("Player #" + number +
        " batting average is " + battingAverage + 
        " There are " + countOfPlayers + " players");
    }
}
