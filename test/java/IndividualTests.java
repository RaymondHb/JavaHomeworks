import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndividualTests {
    @Test
    void testSumOfPowers_1() {
        assertEquals(75, SumOfPower.calculateSumOfPowers(234));
        System.out.println("**--- Test method3 executed ---**");
    }
    @Test
    void testPerfectNumbers_1() {
        assertEquals(true, PerfectNumbers.isPerfectNumber(28));
    }

    @Test
    void testSumOfSeries_1() {
        assertEquals(0.7160493827160495, SumOfSeries.calculateSumOfSeries(3, 4));
    }
    @Test
    void testCelsiusToFah_1 () {
        assertEquals(32.0, P2_CelsiusToFahrenheit.convertCelToFah(0));
    }

    @Test
    void testPayCalculator () {
        assertEquals(35.0, P4_PayCalculator.calculatePay(100));
    }

    @Test
    void testConvertSecondsToMinutes () {
        MinutesAndSeconds expectedValue = new MinutesAndSeconds(2, 30);
        assertEquals(expectedValue, P5_ConvertSecondsToMinute.figureMinutesEasier(150));
    }

    @Test
    void testSummerCampCalculator () {
        assertEquals(true, P6_SummerCampCalculator.bonusOrNot(12));
        assertEquals(false, P6_SummerCampCalculator.bonusOrNot(13));
    }
    @Test
    void testLibraryFeeCalculator () {
        assertEquals(8, P7_LibraryFeeCalculator.feeCalculator(2));
    }
    @Test
    void testPasswordNumberMaker () {
        assertEquals(true, P8_PasswordNumberMaker.isExtraOrdinaryNumber(8));
    }

}
