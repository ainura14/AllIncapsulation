package HomeWorkInc;
import java.time.LocalDate;

public class Car {
    private String mark;
    private int price;
    private LocalDate year;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String toString(){
        return(String.format("""
                *About Car*
                Mark: %s
                Price: %d
                Year: %s""",mark, price, year)
        );
    }
}
