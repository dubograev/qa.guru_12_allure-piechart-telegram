package tests.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {

    @Test
    void squareTest() {
        assertEquals(9, Math.sqrt(81));
    }

    @Test
    void maxTest() {
        assertEquals(417, Math.max(205, 417));
    }

    @Test
    void minTest() {
        assertEquals(205, Math.min(205, 417));
    }

    @Test
    void sumTest() {
        assertEquals(13749, Math.addExact(13548, 201));
    }

    @Test
    void multiplyTest() {
        assertEquals(256, Math.multiplyExact(16, 16));
    }
}
