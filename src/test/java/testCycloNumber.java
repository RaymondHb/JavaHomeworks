import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testCycloNumber {
    @Test
    void testCycloNumber_1() {
        assertEquals(true, P27_CycloNumber.isCycloNumber("6216"));
    }
    @Test
    void testCycloNumber_2() {
        assertEquals(false, P27_CycloNumber.isCycloNumber("6215"));
    }
}
