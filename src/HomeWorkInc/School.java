package HomeWorkInc;
public class School {
    private int number;
    private String address;
    private String focus;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public String toString(){
        return(String.format("""
                *About School*
                Number: %d
                Address: %s
                Focus: %s""",number, address, focus)
        );
    }
}
