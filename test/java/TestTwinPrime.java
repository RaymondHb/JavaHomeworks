import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTwinPrime {
    @Test
    void testTwinPrime_1() {
        assertEquals(true, P24_TwinPrime.areTwinPrime(3, 5));
    }
    @Test
    void testTwinPrime_2() {
        assertEquals(false, P24_TwinPrime.areTwinPrime(4, 5));
    }
}
