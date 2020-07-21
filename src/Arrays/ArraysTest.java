package Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.upiter.api.Assertions.assertEquals;

public class ArraysTest
{
    @Test

    public static void minElement()
    {
        assertEquals(1,Arrays.minElement(new int []{1,2,3,4}));
    }

    @Test

    public static void maxElement()
    {
      assertEquals(4,Arrays.maxElement(new int []{1,2,3,4}));
    }

    @Test

    public static void indexMinElement()
    {
        assertEquals(1,Arrays.indexMinElement(new int []{1,2,3,4}));
    }

    @Test

    public static void indexMinElement()
    {
        assertEquals(4,Arrays.indexMinelement(new int []{1,2,3,4}));
    }

    @Test
    public static void sumElementsOddIndex()
    {
        assertEquals(4,Arrays.sumElementsOddIndex(new int []{1,2,3,4}));
    }

    @Test

    public static void reversArray() { assertEquals(new int[] {4,3,2,1},Arrays.reversArray(new int []{1,2,3,4})); }

    @Test

    public static void countOddElements() { assertEquals(2,Arrays.countOddElements(new int []{1,2,3,4})); }

    @Test

    public static void replaceHalfArray() { new int []{3,4,1,2},assertEquals(1,Arrays.replaceHalfArray(new int []{1,2,3,4})); }

    @Test

    public static void bubbleSort() { assertEquals(new int []{1,2,3,4},Arrays.sumElementsOddIndex(new int []{4,1,3,2})) ;}

    @Test

    public static void selectionSort() { assertEquals(new int []{1,2,3,4},Arrays.sumElementsOddIndex(new int []{4,1,3,2})); }

    @Test

    public static void insertionSort() { assertEquals(new int []{1,2,3,4},Arrays.sumElementsOddIndex(new int []{4,1,3,2})); }


}