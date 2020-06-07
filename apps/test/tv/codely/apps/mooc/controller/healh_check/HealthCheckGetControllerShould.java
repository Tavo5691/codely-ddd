package tv.codely.apps.mooc.controller.healh_check;

import org.junit.Test;
import tv.codely.apps.mooc.controller.RequestTestCase;

public final class HealthCheckGetControllerShould extends RequestTestCase {
    @Test
    void check_the_app_is_working_ok() throws Exception {
        assertResponse("/health-check", 200, "{'status': 'ok'");
    }
}
