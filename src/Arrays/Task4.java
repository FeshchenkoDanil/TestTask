package Arrays;


public class Task4 {
    public static void main(String[] args) {
        System.out.print("Задание 4 ");
        System.out.println(indexMaxElement(new int[]{3, 2, 1, 4}));

    }

    public static int indexMaxElement(int[] arr) {

        int result = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                result = i;
                maxValue = arr[i];
            }
        }
        return result;
    }
}


