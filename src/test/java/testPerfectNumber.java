import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testPerfectNumber {
    @Test
    void testPerfectNumber_1 () {
        assertEquals(true, P19_PerfectNumber.checkPerfectNumber(6));
    }
    @Test
    void testPerfectNumber_2 () {
        assertEquals(false, P19_PerfectNumber.checkPerfectNumber(5));
    }
}
