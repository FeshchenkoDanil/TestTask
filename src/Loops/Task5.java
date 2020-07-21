package Loops;

public class Task5 {

    public static void main(String[] args) {
        System.out.print("Задание 5 ");
        System.out.println(myFactorial(2));
    }

    //  Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
    public static int myFactorial(int a) {
        int response = 1;
        if (a > 1) {
            for (int i = 2; i <= a; i++) {
                response *= i;
            }
        }
        return response;
    }
}