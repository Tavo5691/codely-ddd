package tv.codely.shared.domain;

import java.util.Random;

public final class RandomElementPicker {
    @SafeVarargs
    public static <T> T from(T... elements) {
        Random random = new Random();

        return elements[random.nextInt(elements.length)];
    }
}
