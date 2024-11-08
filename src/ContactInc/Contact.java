package ContactInc;

public class Contact {
    String contactName;
    int phoneNumber;

    public Contact(String contactName, int phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return String.format("""
                Contact name: %s
                Phone number: %d
                """,contactName,phoneNumber);
    }


}
