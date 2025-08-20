package Unit9.NineEight;

// Programmer Kevin Murillo
// Programming exercise 9-8 Part B

public class NonFiction extends Book {

    public NonFiction(String title){
        super(title);
        setPrice();
    }

    public void setPrice(){
        super.price = 37.99;
    }
}