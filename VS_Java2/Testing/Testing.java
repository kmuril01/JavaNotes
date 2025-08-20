package GeMetrixTesting;

public class Testing {

    public static void main(String[] args) {
        String[] territories = new String[2];
        territories[0] = "U.S.";
        territories[1] = "International";

        String[] cocoaBrands = new String[4];
        cocoaBrands[0] = "Regular";
        cocoaBrands[1] = "Dark Choclate";
        cocoaBrands[2] = "Mint Choclate";
        cocoaBrands[3] = "Sugar Free";

        for (int t = 0; t < territories.length; t++) {
            for (int c = 0; c < cocoaBrands.length; c++) {
                System.out.println(territories[t] + "-" + cocoaBrands[c]);
            }
        }
    }

}
