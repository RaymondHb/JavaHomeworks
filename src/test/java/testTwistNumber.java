import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testTwistNumber {
    @Test
    void testTwistNumber_1() {
        assertEquals(true, P28_TwistNumber.isTwistNumber(7254));
    }
    @Test
    void testTwistNumber_2() {
        assertEquals(false, P28_TwistNumber.isTwistNumber(7257));
    }
}
