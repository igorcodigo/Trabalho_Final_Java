import java.util.ArrayList;

public class Shelf {
    private ArrayList<Book> books = new ArrayList<Book>();

    public Boolean addBook(Book newBook) {
        this.books.add(newBook);
        return true;
    }

    public Boolean addBooks(ArrayList<Book> newBook) {
        this.books.addAll(newBook);
        return true;
    }

    public String countBooks() {
        int rentedBooks = 0;
        for (Book book : books) {
            if (book.getAvailability() != true)
            rentedBooks += 1;
        }
        return "Exitem "+books.size()+" e destes "+rentedBooks+" estão alugados";
    }

    public ArrayList<Book> listBooks() {
        return this.books;
    }
}
