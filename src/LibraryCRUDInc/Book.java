package LibraryCRUDInc;

import java.time.LocalDate;

public class Book {
    private Long id;
    private String name;
    private int price;
    private LocalDate publishedYear;
    private String authorName;

    public Book(Long id, String name, int price, LocalDate publishedYear, String authorName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publishedYear = publishedYear;
        this.authorName = authorName;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(LocalDate publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void getInfo(){
        System.out.printf("""
                Id: %d
                Name: %s
                Price: %d
                Date: %s
                Author name: %s
                """,id, name, price,publishedYear,authorName);
    }



}
