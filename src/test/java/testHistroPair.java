import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
class testHistroPair {
    @Test
    void testHistroPair_1() {
        assertEquals(277, P33_HistroPair.findHistroPair(43558));
    }
}
