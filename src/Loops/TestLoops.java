package Loops;

import org.junit.jupiter.api.Test;
import static org.junit.upiter.api.Assertions.assertEquals;

public class TestLoops {

    @Test
    public static void isSimpleNumber() {
        assertEquals(true, Loops.isSimpleNumber(4));
    }

    @Test
    public static void mySqrtChecking() {
        assertEquals(4, Loops.mySqrtChecking(16));
    }

    @Test
    public static void myFactorial() {
        assertEquals(4, Loops.myFactorial(2));
    }

    @Test
    public static void sumOfNumbers() {
        assertEquals(6, Loops.sumOfNumbers(123));
    }

    @Test
    public static void reversNumber() {
        assertEquals(321, Loops.reversNumber(123));
    }


}
