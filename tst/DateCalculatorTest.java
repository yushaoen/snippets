import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author yushaoen
 */
public class DateCalculatorTest {

    @Test
    public void testIsLeapYear() throws Exception {
        assertEquals(true, DateCalculator.isLeapYear(4));
        assertEquals(false, DateCalculator.isLeapYear(100));
        assertEquals(false, DateCalculator.isLeapYear(123));
        assertEquals(true, DateCalculator.isLeapYear(400));
        assertEquals(true, DateCalculator.isLeapYear(800));
        assertEquals(false, DateCalculator.isLeapYear(700));
    }

    @Test
    public void testFindDate() throws Exception {
        assertEquals("January 1", DateCalculator.findDate(1, 1));
        assertEquals("January 31", DateCalculator.findDate(1, 31));
        assertEquals("February 1", DateCalculator.findDate(1, 32));
        assertEquals("February 29", DateCalculator.findDate(4, 60));
        assertEquals("March 1", DateCalculator.findDate(5, 60));
        assertEquals("February 29", DateCalculator.findDate(400, 60));
        assertEquals("March 1", DateCalculator.findDate(500, 60));
        assertEquals("April 30", DateCalculator.findDate(500, 120));
        assertEquals("December 31", DateCalculator.findDate(4, 366));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDateError() throws Exception {
        DateCalculator.findDate(3, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDateError2() throws Exception {
        DateCalculator.findDate(4, 367);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDateError3() throws Exception {
        DateCalculator.findDate(3, 366);
    }
}