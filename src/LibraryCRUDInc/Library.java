package LibraryCRUDInc;

public class Library {
    private Long id;
    private String name;
    private Book[] books = new Book[20];
    private int bookCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public void addBook(Book book){
        this.books[bookCount++] = book;
    }
    public void getAllBooks(){
        for(int i = 0; i < bookCount; i++){
            System.out.printf("""
                    ID: %s
                    bookname: %s
                    price:%d
                    publisherName: %s
                    authorname:%s
                    """, books[i].getId(),books[i].getName(),books[i].getPrice(),books[i].getPublishedYear(),books[i].getAuthorName());
        }
    }

    public void getByBookId(Long bookId){
        boolean bookFound = false;
        for(int i = 0; i < bookCount; i++){
            if (books[i].getId().equals(bookId)) {
                System.out.printf("""
                        ID: %s
                        bookname: %s
                        price:%d
                        publisherName: %s
                        authorname:%s
                        """, books[i].getId(), books[i].getName(), books[i].getPrice(), books[i].getPublishedYear(), books[i].getAuthorName());
                bookFound = true;
                break;
            }
        }
        if(!bookFound){
            System.err.println("not found get Id" + bookId);
        }
    }

    public void updateBookId(Long bookId, Book newBook){
        for(int i = 0 ; i < bookCount; i++){
            if(books[i].getId().equals(bookId)){
                books[i] = newBook;
                break;
            }
        }
    }

    public void deleteBookId(Long bookId){
        boolean deletedBook = false;
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getId().equals(bookId)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("deleted");
                deletedBook = true;
                break;
            }
        }
        if(!deletedBook) {
            System.err.println("Book with this id not found");
        }
    }
}
