package Loops;

public class Task7 {

    public static void main(String[] args) {
        System.out.print("Задание 7 ");
        System.out.println(reversNumbers(123));
    }

    //  Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.
    public static int reversNumbers(int a) {
        int result = 0;
        while (a > 0) {
            result = (result + (a % 10)) * 10;
            a = a / 10;
        }
        return result / 10;
    }
}