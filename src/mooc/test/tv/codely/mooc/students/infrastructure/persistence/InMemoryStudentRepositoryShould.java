package tv.codely.mooc.students.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.students.StudentModuleInfrastructureTestCase;
import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentIdMother;
import tv.codely.mooc.students.domain.StudentMother;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

final class InMemoryStudentRepositoryShould extends StudentModuleInfrastructureTestCase {
    @Test
    void save_a_student() {
        Student student = StudentMother.random();

        repository.save(student);
    }

    @Test
    void return_an_existing_student() {
        Student student = StudentMother.random();

        repository.save(student);

        assertEquals(Optional.of(student), repository.search(student.id()));
    }

    @Test
    void not_return_a_non_existing_student() {
        assertFalse(repository.search(StudentIdMother.random()).isPresent());
    }

}
