package LibraryCRUDInc;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1L, "Singan Kylych",2000, LocalDate.of(2000,12,2), "Japarov");

        Library libr = new Library();
        libr.addBook(book1);
        libr.addBook(new Book(2L, "Singan Kylych",2000, LocalDate.of(2000,12,2), "Japarov"));
//        libr.getAllBooks();
//        libr.getByBookId(3L);
//
//        libr.updateBookId(1L,new Book(1L, "Singan Kylych",2000, LocalDate.of(2016,12,2), "Kasymaly J."));
//
//        libr.deleteBookId(1l);
        libr.deleteBookId(2l);
        libr.getAllBooks();
    }
}
