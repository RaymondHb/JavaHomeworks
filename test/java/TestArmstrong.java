import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestArmstrong {
    @Test
    void testArmstrong_1() {
        assertEquals(true, P22_ArmstrongNumber.checkArmstrong(153));
    }
    @Test
    void testArmstrong_2() {
        assertEquals(false, P22_ArmstrongNumber.checkArmstrong(154));
    }
}
