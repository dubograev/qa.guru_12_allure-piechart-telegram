package tests.four;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {

    @Test
    void squareTest() {
        assertEquals(11, Math.sqrt(81));
    }

    @Test
    void maxTest() {
        assertEquals(400, Math.max(205, 417));
    }

    @Test
    @Disabled("Test")
    void minTest() {
        assertEquals(205, Math.min(205, 417));
    }

    @Test
    @Disabled("Временно отключён")
    void sumTest() {
        assertEquals(13749, Math.addExact(13548, 201));
    }

    @Test
    @Disabled()
    void multiplyTest() {
        assertEquals(256, Math.multiplyExact(16, 16));
    }
}
