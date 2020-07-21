package Loops;

public class Task4 {

    public static void main(String[] args) {
        System.out.print("Задание 4 ");
        System.out.println(mySqrtBinSearch(55));
    }

    // Метод бинарного поиска
    public static int mySqrtBinSearch(int a) {
        int response = a;

        while (response * response > a) {
            response /= 2;
        }
        while (response * response < a) {
            response++;
        }
        return response;
    }
}
