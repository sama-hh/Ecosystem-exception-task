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

    public Student findStudentById(String id) {
        if (students.containsKey(id)) {
            return students.get(id);
        }
        throw new IllegalArgumentException("There is no student with id " + id);
    }
}
