import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNeonNumber {
    @Test
    void testNeonNumber_1() {
        assertEquals(true, P25_NeonNumber.checkNeonNumber(9));
    }
    @Test
    void testNeonNumber_2() {
        assertEquals(false, P25_NeonNumber.checkNeonNumber(10));
    }
}
