package tv.codely.shared.domain;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public final class EmailMother {
    public static String random() {
        FakeValuesService fakeValuesService = new FakeValuesService(Locale.ENGLISH, new RandomService());
        return fakeValuesService.bothify("???????####@gmail.com");
    }
}
