package IntroductionInc;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        IntroductionInc.Student student = new IntroductionInc.Student("Ainura", "Nusubalieva", 19,'F');
//        student.showInfo();


//        IntroductionInc.Rectangle rectangle = new IntroductionInc.Rectangle();
//        rectangle.setHeigth(23.4);
//        rectangle.setWidth(12);
//        System.out.println("The area of rectangle is: " + rectangle.findArea());

        Student1 student1 = new Student1();
        Scanner scanner = new Scanner(System.in);
        Scanner scanForNum = new Scanner(System.in);

        System.out.println("Enter your name: ");
        student1.setName(scanner.nextLine());

        System.out.println("Enter your surname: ");
        student1.setSurname(scanner.nextLine());

        System.out.println("Enter your age: ");
        student1.setAge(scanForNum.nextInt());

        System.out.println("Enter your size of lessons: ");
        int size = scanForNum.nextInt();

        String[] courses = new String[size];

        for(int i = 0; i < size; i++){
            System.out.println("Write lesson: ");
            courses[i] = scanner.nextLine();
        }

//        student1.setCourses(new String[]{"dg","rdg"});
        student1.setCourses(courses);

        System.out.println(Arrays.toString(student1.getCourses()));


    }
}