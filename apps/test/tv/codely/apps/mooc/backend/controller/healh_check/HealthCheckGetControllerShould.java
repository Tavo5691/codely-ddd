package tv.codely.apps.mooc.backend.controller.healh_check;

import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.backend.controller.RequestTestCase;

public final class HealthCheckGetControllerShould extends RequestTestCase {
    @Test
    void check_the_app_is_working_ok() throws Exception {
        assertResponse("/health-check", 200, "{'status': 'ok'}");
    }
}
