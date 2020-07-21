package Loops;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Задание 2 ");
        System.out.println(isSimpleWriter(55));
    }

    //  Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
    public static boolean isSimpleNumber(int in) {
        boolean response = true;
        for (int i = 2; i < in; i++) {
            if (in % i == 0) {
                response = false;
            }
        }
        return response;
    }
}
