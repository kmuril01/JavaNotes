package GeMetrixTesting;

public class Book {

    int test = 1;
    int bookId;
    String bookType;
    String bookName;
    double price;
    String numberOfPages = null;

    Book(int bookIdValue, String bookTypeValue, String bookNameValue, double priceValue) {
        bookId = bookIdValue;
        bookType = typeValue;
        bookName = bookNameValue;
        price = priceValue;
    }

    Book(int bookIdValue, String bookTypeValue, String bookNameValue, double priceValue, int numberOfPagesValue) {
        bookId = bookIdValue;
        bookType = typeValue;
        bookName = bookNameValue;
        price = priceValue;
        numberOfPages = numberOfPagesValue;

    }

    Book book1 = new Book(101, 'Fiction', 'Tall Tales', 9.99)
}
