import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFactorials {
    @Test
    void testFactorials_1 (){
        assertEquals(120, Factorials.calculateFactorial(5));
    }

    @Test
    void testFactorials_2 () {
        assertEquals(120, Factorials.calculateFactorialRecursion(5));
    }
}
