package Loops;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Задание 1 ");
    }

    // Найти сумму четных чисел и их количество в диапазоне от 1 до 99
    public static int[] sumAndCountEvenElements() {
        int sum = 0, count = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        return new int[]{sum, count};
    }

}