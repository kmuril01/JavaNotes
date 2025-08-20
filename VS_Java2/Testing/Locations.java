package GeMetrixTesting;

public class Locations {

    public static void main(String[] args) 
    {
        {
        String[][] locations = {"North", "South", "East", "West"},
        {"Main", "IT", "Shipping"},
         };
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) { 
                System.out.println(locations[i][j]); 
        } 
    }
}
}
