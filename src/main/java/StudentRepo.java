import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

//    public Optional<Student> findStudentById(String id) {
//        if (id == null) {
//            throw new IllegalArgumentException("Id cannot be null");
//        }
//        return Optional.ofNullable(students.get(id));
//    }
}
