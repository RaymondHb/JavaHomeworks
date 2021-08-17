import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPrimeCompositeNumber {
    @Test
    void testPrimeNumberAndComposite_1 () {
        assertEquals(false, P17to18_PrimeAndCompositeNumber.checkPrimeNumber(5));
    }
    @Test
    void testPrimeNumberAndComposite_2 () {
        assertEquals(true, P17to18_PrimeAndCompositeNumber.checkPrimeNumber(4));
    }
}
