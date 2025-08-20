package Unit9.NineEight;

// Programmer Kevin Murillo
// Programming exercise 9-8 Part D

import java.util.*;

public class BookArray {

    public static void main(String[] args) {
        Book someBooks[] = new Book[10];
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        int x;
        String title;
        String type;
        for(x = 0; x < someBooks.length; ++x)
        {
            System.out.print("Enter title >> ");
            title = kb.nextLine();
            System.out.println("Is this a (F)iction or");
            System.out.print("(N)onfiction title? >> ");
            type = kb.nextLine();
            if(type.equals("F"))
            {
                Fiction fBook = new Fiction(title);
                someBooks[x] = fBook;
            }
            else
                if(type.equals("N"))
                {
                    NonFiction nfBook = new NonFiction(title);
                    someBooks[x] = nfBook;
                }
                else{
                    System.out.println("Entry must be F or N");
                    --x;
                }
        }
        for(x = 0; x < someBooks.length; ++x)
            System.out.println("Book: " + 
            someBooks[x].getTitle() + " costs $" +
            someBooks[x].getPrice());
    }

}
