package Function;


public class FunctionTest {

    @Test
    public static void dayOfNumber()
    {
        assertEquals("Четверг",Function.dayOfNumber(4));
    }

    @Test
    public static  void numberToText()
    {
        assertEquals("One",Function.numberToText(1));
    }

    @Test
    public static  void numberToText()
    {
        assertEquals("One",Function.numberToText(1));
    }

    @Test
    public static  void stringToNumber()
    {
        assertEquals(900000000000,Function.stringToNumber(" Nine billion "));
    }

    @Test
    public static  void calculateDistanceBetweenPoints()
    {
        assertEquals(3,Function.calculateDistanceBetweenPoints(1,1,4,4));
    }

    @Test
    public static  void numberToText2()
    {
        assertEquals("Nine billion",Function.numberToText2(90000000000));
    }





}