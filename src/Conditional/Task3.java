package Conditional;

public class Task3 {

    public static void main(String[] args) {
        System.out.print("Задание 3 ");
        System.out.println(sumOfPositiveElements(1,2,3));
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

}