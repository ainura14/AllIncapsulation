package StudentHW;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1L, "Saikal", "Amantaeva", 20);
        Student student2 = new Student(2L, "Samara", "Samidinova", 21);
        Student student3 = new Student(3L, "Samar", "Samidinova", 21);

        Student[] students = {student1, student2,student3};

        StudentManager studentManager = new StudentManager(1L, "Abdukadyr", students);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

//        studentManager.getStudentsById(3L);
//        studentManager.updateStudent(2L, new Student(2L, "Salamat", "Tynchtykov", 21));
        studentManager.deleteStudent(2L);
        studentManager.getAllStudents();
    }
}
