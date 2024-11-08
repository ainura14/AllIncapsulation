package HomeWorkInc;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University univer1 = new University();
        univer1.setName("KTU Manas");
        univer1.setAddress("Djal - 23");
        univer1.setAmountOfStudents(5000);

        University univer2 = new University();
        univer2.setName("Ala-Too");
        univer2.setAddress("Ankara");
        univer2.setAmountOfStudents(3000);

        University univer3 = new University();
        univer3.setName("Politech");
        univer3.setAddress("C. Aitmatov");
        univer3.setAmountOfStudents(3200);

        University[] universities = {univer1, univer2, univer3};

        School school1 = new School();
        school1.setNumber(84);
        school1.setAddress("Ak-Orgo");
        school1.setFocus("Matematik");

        School school2 = new School();
        school2.setNumber(24);
        school2.setAddress("Chuy");
        school2.setFocus("Fizik");

        School school3 = new School();
        school3.setNumber(44);
        school3.setAddress("Moskovskiy");
        school3.setFocus("Biology");

        School[] schools = {school1, school2, school3};

        Car car1 = new Car();
        car1.setMark("Lexus");
        car1.setPrice(34000);
        car1.setYear(LocalDate.of(2023, 05, 23));

        Car car2 = new Car();
        car2.setMark("Toyota");
        car2.setPrice(30000);
        car2.setYear(LocalDate.of(2020, 04, 12));

        Car car3 = new Car();
        car3.setMark("Hyundai");
        car3.setPrice(14000);
        car3.setYear(LocalDate.of(2019, 07, 18));

        Car[] cars = {car1, car2, car3};

        Person person1 = new Person();
        person1.setName("Ainura");
        person1.setSurname("Nusubalieva");
        person1.setAge(19);
        person1.setHobby("Driving");
        person1.setSchool(school1);
        person1.setUniver(univer1);
        person1.setCar(car1);

        Person person2 = new Person();
        person2.setName("Akylai");
        person2.setSurname("Nusubalieva");
        person2.setAge(24);
        person2.setHobby("Learning");
        person2.setSchool(school2);
        person2.setUniver(univer2);
        person2.setCar(car2);

        Person person3= new Person();
        person3.setName("Janylai");
        person3.setSurname("Nusubalieva");
        person3.setAge(22);
        person3.setHobby("Watching");
        person3.setSchool(school3);
        person3.setUniver(univer3);
        person3.setCar(car3);

        Person[] people = {person1, person2, person3};


        for(Person person : people){
            System.out.println(person.toString());
            System.out.println("***************");
        }
    }
}