package Arrays;


public class Task2 {
    public static void main(String[] args) {
        System.out.print("Задание 2 ");
        System.out.println(maxElement(new int[]{3,2,1,4}));
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}