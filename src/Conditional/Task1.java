package Conditional;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Задание 1 ");
        System.out.println(sumOrAdd(1,2));
    }


    // Если а – четное посчитать а*б, иначе а+б
    public static int sumOrAdd(int a, int b) {
        int result;
        if (a % 2 == 0) {
            result = a * b;
        } else {
            result = a + b;
        }
        return result;
    }

}