package com.company;

public class Conditional {
    public static class Conditions {
        // Если а – четное посчитать а*б, иначе а+б
        public static int sumOrAdd(int a, int b)
        {
            int result;
            if (a % 2 == 0)
            {
                result = a * b;
            } else
            {
                result = a + b;
            }
            return result;
        }

        // Определить какой четверти принадлежит точка с координатами (х,у)
        public static String findQuarter(int x, int y)
        {
            String result="";

            if(x >= 0)
            {
                if (y >=0 )
                {
                    result = "Point belongs to 1 quarter";
                } else{
                    result = "Point belongs to 4 quarter";
                }
            }

            if(x<= 0)
            {
                if (y>=0 )
                {
                    result = "Point belongs to 2 quarter";
                } else{
                    result = "Point belongs to 3 quarter";
                }
            }
            return result;
        }

        //  Найти суммы только положительных из трех чисел
        public static int sumOfPositiveElements(int a, int b, int c)
        {
            int sum  = 0;
            if (a >= 0)
                sum += a;
            if (b >= 0)
                sum += b;
            if (c >= 0)
                sum += c;

            return sum;
        }

        //  Посчитать выражение макс(а*б*с, а+б+с)+3
        public static int calculateMax(int a, int b, int c)
        {
            int response;
            int x = a * b * c;
            int y = a + b + c;
            if (x > y)
            {
                response = x;
            }
            else response = y;
            return response + 3;
        }

        //  Написать программу определения оценки студента по его рейтингу, на основе следующих правил
        public static String findStudentMark(int a)
        {
            int Mark = a;
            String result ="";

            if (  Mark >= 0)
                if(Mark <= 19)
                {
                    result = " your Mark is A";
                }
            if (Mark >= 20)
                if (Mark <= 39)
                {
                    result = " your Mark is E";
                }
            if (Mark >= 40)
                if (Mark <= 59)
                {
                    result = " your Mark is D";
                }
            if (Mark >= 60)
                if (Mark <= 74)
                {
                    result = " your Mark is C";
                }
            if (Mark >= 74)
                if (Mark <= 80)
                {
                    result = " your Mark is B";
                }
            if (Mark >= 90)
                if (Mark <= 100)
                {
                    result = " your Mark is A";
                }

            return result ;
        }
    }
}
