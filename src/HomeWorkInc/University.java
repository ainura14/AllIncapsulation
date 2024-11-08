package HomeWorkInc;
public class University {
    private int amountOfStudents;
    private String name;
    private String address;


    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return (String.format("""
                *About University*
                Amount of Students: %d
                Name: %s
                Address: %s""",amountOfStudents, name, address)
        );
    }
}
