package StudentHW;

public class StudentManager {
    private Long id;
    private String name;
    private Student[] students;
    private int studentCount;

    public StudentManager(Long id, String name, Student[] students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    public void addStudent(Student student){
        this.students[studentCount++] = student;
    }

    public void getAllStudents(){
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("""
                    Id: %s
                    Name: %s
                    Surname: %s
                    Age %d
                    """, students[i].getId(), students[i].getName(), students[i].getSurname(),students[i].getAge()
            );
            System.out.println("***************");
        }
    }

    public void getStudentsById(Long studentId){
        boolean findStudent = false;
        for (int i = 0; i < studentCount; i++) {
            if(students[i].getId().equals(studentId)){
                System.out.printf("""
                    Id: %s
                    Name: %s
                    Surname: %s
                    Age %d
                    """, students[i].getId(), students[i].getName(), students[i].getSurname(),students[i].getAge()
                );
                findStudent = true;
                break;
            }
        }
        if(!findStudent){
            System.err.println("The student with " + studentId + "not found");
        }

    }

    public void updateStudent(Long studentId, Student newStudent){
        boolean updateS = false;
        for (int i = 0; i < studentCount; i++) {
            if(students[i].getId().equals(studentId)){
                students[i] = newStudent;
                System.out.println("Successfully update");
                updateS = true;
                break;
            }
        }
        if(!updateS){
            System.err.println("Student was not updated");
        }
    }
    public void deleteStudent(Long studentId){
        boolean deletedS = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(studentId)){
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Successfully deleted");
                deletedS = true;
                break;
            }
        }
        if(!deletedS){
            System.err.println("Student was not deleted");
        }
    }
}
