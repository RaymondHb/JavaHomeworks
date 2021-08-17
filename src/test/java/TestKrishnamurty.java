import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestKrishnamurty {
    @Test
    void testKrishnamurtyNumber_1() {
        assertEquals(true, P23_KrishnamurtyNumber.checkKrishnaMurtyNumber(145));
    }
    @Test
    void testKrishnamurtyNumber_2() {
        assertEquals(false, P23_KrishnamurtyNumber.checkKrishnaMurtyNumber(146));
    }
}
