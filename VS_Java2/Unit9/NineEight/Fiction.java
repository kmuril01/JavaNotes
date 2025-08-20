package Unit9.NineEight;

// Programmer Kevin Murillo
// Programming exercise 9-8 Part B

public class Fiction extends Book {

    public Fiction(String title){
        super(title);
        setPrice();
    }

    public void setPrice(){
        super.price = 24.99;
    }
}
