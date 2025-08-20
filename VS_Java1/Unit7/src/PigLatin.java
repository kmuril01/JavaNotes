import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to be converted to Pig Latin >> ");
        String word = scanner.nextLine().trim();
        String pigLatin = "";

        if ("aeiou".indexOf(word.charAt(0)) != -1) 
        {
            pigLatin = word + "ay";
        } 
        else 
        {
            pigLatin = word.substring(1) + word.charAt(0) + "ay";
        }

        System.out.println("Pig Latin version: " + pigLatin);
    }
}