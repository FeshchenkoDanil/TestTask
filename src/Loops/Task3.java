package Loops;

public class Task3 {

    public static void main(String[] args) {
        System.out.print("Задание 3");
        System.out.println(mySqrtChecking(16));
    }

    // Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)
    // Вариант последовательного подбора
    public static int mySqrtChecking(int a) {
        int i = 1;
        while (i * i <= a) {
            i++;
        }
        return i - 1;
    }
}
