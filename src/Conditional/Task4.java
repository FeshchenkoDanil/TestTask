package Conditional;

public class Task4 {

    public static void main(String[] args) {
        System.out.print("Задание 4 ");
        System.out.println(calculateMax(1,2,3));
    }

    //  Посчитать выражение макс(а*б*с, а+б+с)+3
    public static int calculateMax(int a, int b, int c)
    {
        int result;
        int x = a * b * c;
        int y = a + b + c;
        if (x > y)
        {
            result = x;
        }
        else result = y;
        return result  + 3;
    }
}