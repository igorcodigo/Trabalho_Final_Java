import java.util.ArrayList;

public class Main {

    private static ArrayList<Book> createManyBooks(int qnt) {
        var books = new ArrayList<Book>();

        while (qnt > 0) {
            books.add(new Book(
                    String.format("%f", Math.random()),
                    String.format("%f", Math.random())));
            qnt--;
        }
        return books;
    }

    private static void printBooks(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.print(i + "- " + books.get(i).getName() + "\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- INICIO DO PROGRAMA ---");

        var user1 = new User("vinicius");
        System.out.println("exite um usuario chamado " + user1.getName());
        System.out.println("mas mudou seu nome para " + user1.setName("vini"));

        var livro1 = new Book("abcedario", "vini");
        System.out.println("exite um livro chamado " + livro1.getName() + " de autor " + livro1.getAuthor());
        livro1.updateBook("ceu azul", "vinicius");
        System.out.println("mas mudou para " + livro1.getName() + " de autor " + livro1.getAuthor());
        System.out.println("de qualquer forma a disponibilidade do livro sempre começa " + livro1.getAvailability());

        user1.setFavoriteBook(livro1);
        System.out.println(
                "e, não por coincidencia, o livro favorito de " + user1.getName() + " é " + user1.getFavoriteBook());

        var employee1 = new Employee();
        System.out.println("sempre que " + user1.getName()
                + " quer alugar um livro ele precisa pedir para um funcionario verificar se o livro está disponivel, no caso o livro "
                + livro1.getName() + employee1.verifyBookAvailability(livro1));

        System.out.println("nesse caso, ao pedir para alugar o livro o funcionadio diz que o processo foi "
                + employee1.alugar(livro1));

        System.out.println("se ao mesmo tempo mais alguem quiser alugar o memso livro o funcionadio diz que "
                + employee1.alugar(livro1));

        System.out.println(
                "antes de mais alguem alugar é preciso devolver o livro, onde o funcionario dira que o processo "
                        + employee1.devolver(livro1));

        var shelf1 = new Shelf();
        var manyBooks = createManyBooks(3);
        shelf1.addBooks(manyBooks);
        shelf1.addBook(livro1);
        System.out.println("quando organizamos os livros da estante sabemos que:" + shelf1.countBooks());
        System.out.println("e que os livros nela são:");
        printBooks(shelf1.listBooks());

        System.out.println("por fim, mas não menos importante, temos uma biblioteca");
        var library1 = new Library();
        library1.addshelf(new Shelf());
        var livro2 = new Book("1234","5678");
        library1.addBookOnShelf(0, livro2);
        System.out.println("--- FIM DO PROGRAMA ---");
    }
}
