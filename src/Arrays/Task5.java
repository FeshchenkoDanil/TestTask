package Arrays;


public class Task5 {
    public static void main(String[] args) {
        System.out.print("Задание 5 ");
        System.out.println(sumElementsOddIndex(new int[]{3, 2, 1, 4}));

    }

    public static int sumElementsOddIndex(int[] arr) {

        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                result += arr[i];
            }
        }
        return result;
    }
}