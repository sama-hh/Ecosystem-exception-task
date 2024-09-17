//Step 1: Extend the StudentDB with a findById method with a parameter id that returns a Student. For the self-confident:
// If you want to proceed test-driven (TDD, test-driven development), you can also start with step 3.
//
//Step 2: The findById method should throw an appropriate exception if no student with the Id exists.
// Also consider what the "appropriate exception" might be. A Checked Exception or an Unchecked Exception?
// An instance of a predefined or a self-written exception class?
//
//Step 3: Write at least one test that verifies this behavior.


public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentRepo studentRepo = new StudentRepo();

        Student newStudent = Student.builder()
                .id("1")
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Students: " +  studentService.getAllStudents());

        try {
            studentRepo.findStudentById(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
