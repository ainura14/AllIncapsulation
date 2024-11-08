package IntroductionInc;

import java.util.Arrays;

public class Student1 {
    private String name;
    private String surname;
     private int age;
     private String[] courses;

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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void infoAboutStudent(){
        System.out.println(String.format("""
                Name: %s
                Surname: %s
                Age: %d
                Courses: %s
                """,getName(), getSurname(), getAge(), Arrays.toString(getCourses())));
    }
}
