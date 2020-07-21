package Conditional;


public class Task5 {

    public static void main(String[] args) {
        System.out.print("Задание 5 ");
        System.out.println(findStudentMark(88));
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