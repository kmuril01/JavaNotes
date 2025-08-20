package Unit9.NineEight;

// Programmer Kevin Murillo
// Programming exercise 9-8 Part C

import java.util.*;

public class UseBook {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        String title;
        
        System.out.print("Enter fiction book title >> ");
        title = kb.nextLine();
        Fiction fBook = new Fiction(title);
        
        System.out.print("Enter nonfiction book title >> ");
        title = kb.nextLine();
        NonFiction nfBook = new NonFiction(title);
        
        System.out.println("Fiction " + 
        fBook.getTitle() + " costs $" + 
        fBook.getPrice());
        
        System.out.println("Non-Fiction " + 
        nfBook.getTitle() + " costs $" + 
        nfBook.getPrice());

    }
}
