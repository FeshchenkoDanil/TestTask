package Loops;

public class Task6 {

    public static void main(String[] args) {
        System.out.print("Задание 6 ");
        System.out.println(sumOfNumbers(12));
    }

    //  Посчитать сумму цифр заданного числа
    public static int sumOfNumbers(int a) {
        int result = 0;
        while (a != 0) {
            result += a % 10;
            a /= 10;
        }
        return result;
    }
}
