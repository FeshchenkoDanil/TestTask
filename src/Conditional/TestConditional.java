package Conditional;

import org.junit.jupiter.api.Test;

import static org.junit.upiter.api.Assertions.assertEquals;

public class TestConditional
{
    @Test
    public static void sumOrAdd()
    {
        assertEquals(3,Conditional.sumOrAdd(1,2));
    }

    @Test

    public static void findQuartet()
   {
       assertEquals("Point belongs to 1 quarter",Conditional.findQarter(1,2));
   }

   @Test

    public static void sumOfPositiveElements()
   {
       assertEquals(3, Conditional.sumOfPositiveElement(1,-3,2));
   }

   @Test

    public static void calculateMax()
   {
       assertEquals(9,Conditional.calculateMax(1,2,3));
   }

   @Test

    public static void findStudentMark()
   {
       assertEquals(" your Mark is B" , Conditional.findStudentMark(88));
   }



}