package Unit9.NineEight;

// Programmer Kevin Murillo
// Programming exercise 9-8 Part A

public abstract class Book {
    String title = new String();
    double price;

    public Book(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public abstract void setPrice();

}
