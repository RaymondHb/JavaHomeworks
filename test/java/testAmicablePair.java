import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testAmicablePair {
    @Test
    void testAmicable_1() {
        assertEquals(true, P21_AmicablePairOfNumbers.findAmicablePair(220));
    }
    @Test
    void testAmicable_2() {
        assertEquals(false, P21_AmicablePairOfNumbers.findAmicablePair(221));
    }
}
