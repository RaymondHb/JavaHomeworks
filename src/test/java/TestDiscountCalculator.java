import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDiscountCalculator {
    @Test
    void testDiscountCalculator_1() {
        assertEquals(20, DiscountCalculator.calculatePrice(4, 400));
    }
    @Test
    void testDiscountCalculator_2() {
        assertEquals(4.8, DiscountCalculator.calculatePrice(34, 400));
    }
    @Test
    void testDiscountCalculator_3() {
        assertEquals(9.2, DiscountCalculator.calculatePrice(19, 400));
    }
    @Test
    void testDiscountCalculator_50 () {
        assertEquals(100, P9_DiscountCalculator.calculateDiscountedPrice(200, 200));
    }
    @Test
    void testDiscountCalculator_25 () {
        assertEquals(150, P9_DiscountCalculator.calculateDiscountedPrice(200, 70));
    }
    @Test
    void testDiscountCalculator_10 () {
        assertEquals(180, P9_DiscountCalculator.calculateDiscountedPrice(200, 11));
    }
    @Test
    void testDiscountCalculator_4 () {
        assertEquals(192, P9_DiscountCalculator.calculateDiscountedPrice(200, 5));
    }
}
