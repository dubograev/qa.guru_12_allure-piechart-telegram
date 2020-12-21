package tests.five;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {

    @Test
    void squareTest() {
        step ("Квадратный корень из 81 равен 9", () -> {
            assertEquals(9, Math.sqrt(81));
        });
    }

    @Test
    void maxTest() {
        step("Максимальное число из 205 и 417 равно 417", () -> {
            assertEquals(417, Math.max(205, 417));
        });
    }

    @Test
    void minTest() {
        step("Минимальное число из 205 и 417 равно 205", () -> {
            assertEquals(205, Math.min(205, 417));
        });
    }

    @Test
    @DisplayName("Cумма чисел 13548 и 201 равна 13749")
    void sumTest() {
        step("Сумма чисел 13548 и 201 равна 13749", () -> {
            assertEquals(13749, Math.addExact(13548, 201));
        });
    }

    @Test
    void multiplyTest() {
        step("Произведение чисел 16 и 16 равно 256", () -> {
            assertEquals(256, Math.multiplyExact(16, 16));
        });
    }
}
