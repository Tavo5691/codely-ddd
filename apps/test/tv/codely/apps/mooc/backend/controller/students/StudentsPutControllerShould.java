package tv.codely.apps.mooc.backend.controller.students;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.backend.controller.RequestTestCase;

@Ignore
public final class StudentsPutControllerShould extends RequestTestCase {

    @Test
    public void create_a_valid_non_existing_student() throws Exception {
        assertRequestWithBody(
                "PUT",
                "/students/5f02bd85-84a4-4870-8b4b-bb0fbf7e1215",
                "{\"name\": \"Rafa\", \"surname\": \"Bolivar\", \"email\": \"rb@gmail.com\"}",
                201
        );
    }
}
