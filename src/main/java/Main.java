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
