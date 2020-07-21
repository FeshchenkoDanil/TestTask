package Arrays;


public class Task7 {
    public static void main(String[] args) {
        System.out.print("Задание 7 ");
        System.out.println(countOddElements(new int[]{3, 2, 1, 4}));

    }
    public static int countOddElements(int[] arr) {

        int response = 0;

        for (int currentElement : arr) {
            if (currentElement % 2 != 0) {
                response++;
            }
        }
        return response;
    }
}