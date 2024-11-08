package HomeWorkInc;
import java.util.Arrays;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String hobby;
    private University univer;
    private School school;
    private Car car;
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public University getUniver() {
        return univer;
    }

    public void setUniver(University univer) {
        this.univer = univer;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString(){
        return (String.format("""
                Name:%s
                Surname:%s
                Age: %d
                My hobby: %s
                My School: %s
                My University: %s
                My Car: %s
                """,name, surname, age, hobby, school.toString(), univer.toString(), car.toString())
        );
    }
}
