import java.nio.file.*;
import java.io.*;

public class BonusBug11 {
    public static void main(String[] args) {
        // Corrected path to the data file
        Path file = Paths.get("/home/nt-user/workspace/CusDiscountFile.txt"); // Fixed the path

        String[] cusDisRec;  // Array to store the data values as string array
        String cusDis;
        String delimiter = ",";  // Delimiter of the data file values
        String cusId, discount;
        int count = 0; // Initialize count to 0

        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();

            cusDis = reader.readLine();
            while (cusDis != null) {
                cusDisRec = cusDis.split(delimiter);  // Splits the data values by delimiter
                
                // Ensure the array has enough elements
                if (cusDisRec.length >= 2) {
                    cusId = cusDisRec[0]; // Stores the value of CusId
                    discount = cusDisRec[1]; // Corrected to use the second element (index 1)

                    System.out.println("Customer ID " + cusId + " gets " + discount + "% discount");
                    count++; // Increment the count for each valid record
                } else {
                    System.out.println("Invalid record: " + cusDis); // Handle invalid records
                }

                cusDis = reader.readLine(); // Read the next line
            }

            reader.close(); 
            System.out.println("There are " + count + " records in this file."); 
        } catch (IOException e) {
            System.out.println("Message: " + e.getMessage()); // Specific error message
        }
    }
}
