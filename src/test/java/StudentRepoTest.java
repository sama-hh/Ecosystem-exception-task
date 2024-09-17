import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    @Test
    void findStudentById_when_id_is_null() {
        //GIVEN
        String id = null;
        StudentRepo studentRepo = new StudentRepo();

        // WHEN & THEN
        assertThrows(IllegalArgumentException.class, () -> studentRepo.findStudentById(id));
    }
}