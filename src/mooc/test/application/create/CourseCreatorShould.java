package application.create;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import tv.codely.mooc.courses.application.create.CourseCreator;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import static org.mockito.Mockito.*;

final class CourseCreatorShould {

    @Mock
    private CourseRepository repository;

    @InjectMocks
    private CourseCreator creator;

    @Test
    void create_a_valid_course() {
        String id = "some-id";
        String name = "name";
        String duration = "duration";

        Course course = new Course(id, name, duration);

        creator.create(course.id(), course.name(), course.duration());

        verify(repository, atLeastOnce()).save(course);
    }
}
