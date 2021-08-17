import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPalindromic {
    @Test
    void testPalindromicNumber_1 () {
        assertEquals(true, P20_PalindromicNumbers.checkPalindrome(new int[] {1,2,2,1}));
    }
    @Test
    void testPalindromicNumber_2 () {
        assertEquals(false, P20_PalindromicNumbers.checkPalindrome(new int[] {1,2,3,1}));
    }
    @Test
    void testPalindromicNumber_3 () {
        assertEquals(true, P20_PalindromicNumbers.checkPalindrome(new int[] {1,2,1}));
    }
    @Test
    void testPalindromicNumber_4 () {
        assertEquals(false, P20_PalindromicNumbers.checkPalindrome(new int[] {1,1,1,5,1,1}));
    }
}
