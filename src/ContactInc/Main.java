package ContactInc;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Akyl", 703245555);
        Contact contact2 = new Contact("Asyl", 705245555);
        Contact contact3 = new Contact("Asyl", 705245555);

        Contact[] contacts1 = {contact1, contact2};
        Contact[] contacts2 = {contact3};

        Phone phone1 = new Phone();
        phone1.setBrand("Ipnone");
        phone1.setModel("X");
        phone1.setPrice(12000);
        phone1.setPhonesUserName("Akyl");
        phone1.setContact(contacts1);

        Phone phone2 = new Phone();
        phone2.setBrand("Ipnone");
        phone2.setModel("X");
        phone2.setPrice(12000);
        phone2.setPhonesUserName("Akyl");
        phone2.setContact(contacts2);

//        System.out.println(phone1.getInfo());
//        System.out.println(phone2.getInfo());
//        phone1.getInfo();
        phone1.getContactCount();
    }
}