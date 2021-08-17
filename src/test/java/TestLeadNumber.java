import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLeadNumber {
    @Test
    void testLeadNumber_1() {
        assertEquals(true, P26_LeadNumber.isLeadNumber(1452));
    }
    @Test
    void testLeadNumber_2() {
        assertEquals(false, P26_LeadNumber.isLeadNumber(1453));
    }
}
