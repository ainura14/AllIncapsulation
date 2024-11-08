package ContactInc;
import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private int price;
    private String phonesUserName;
    private Contact[] contact;

    public String getFormat() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhonesUserName() {
        return phonesUserName;
    }

    public void setPhonesUserName(String phonesUserName) {
        this.phonesUserName = phonesUserName;
    }
    public Contact[] getContact() {
        return contact;
    }

    public void setContact(Contact[] contact) {
        this.contact = contact;
    }

    int amountOfCount = 0;
//    public String getInfo(){
//       return String.format("""
//               Brand: %s
//               Model: %s
//               Price: %d
//               Phone user name: %s
//               Contact: %s
//               """,brand, model,price, phonesUserName, Arrays.toString(contact) );
//    }
    public void getInfo(){
        System.out.printf("""
              Brand: %s
              Model: %s
              Price: %d
              Phone user name: %s
              """, brand, model,price, phonesUserName
              );
    }
    public void getContactCount(){
        getInfo();
        for(Contact contact1 : contact){
            System.out.println(contact1.toString());
        }
    }
}
