package Unit11.CodeIt;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import java.util.*;

public class FileSizeComparison {

public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    String text;
    String word;
    System.out.print("Enter name of text file >> ");
    text = kb.nextLine();
    System.out.print("Enter name of Word file >>");
    word = kb.nextLine();
    Path textFile = 
        Paths.get("./" + text);
    Path wordFile =
        Paths.get("./" + word);
    try{
        BasicFileAttributes attrText = 
            Files.readAttributes(textFile, BasicFileAttributes.class);
        BasicFileAttributes attrWord =
            Files.readAttributes(wordFile, BasicFileAttributes.class);
        long textSize = attrText.size();
        long wordSize = attrWord.size();
        double ratio = textSize * 100.0 / wordSize;
        System.out.println(textFile.toString() + " is " +
            textSize + " bytes long");
        System.out.println(wordFile.toString() + " is" +
            wordSize + " bytes long");
        System.out.println("The text file is " +
            ratio + "% of the size of the Word file");
    }
    catch(IOException e)
    {
        System.out.println("IO Exception");
    }
}

}
