import java.util.ArrayList;

public class Library {
    private ArrayList<Shelf> shelfs = new ArrayList<Shelf>();

    public Boolean addshelf(Shelf newShelf) {
        this.shelfs.add(newShelf);
        return true;
    }

    public Boolean addBookOnShelf(int position, Book newBook) {
        this.shelfs.get(position).addBook(newBook);
        return true;
    }

    public ArrayList<Shelf> listShelfs() {
        return this.shelfs;
    }
}
