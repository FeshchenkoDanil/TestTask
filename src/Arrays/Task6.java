package Arrays;


public class Task6 {
    public static void main(String[] args) {
        System.out.print("Задание 6 ");
        System.out.println(reversArray(new int[]{3, 2, 1, 4}));

    }

    public static int[] reversArray(int[] arr) {

        int result[] = new int[arr.length];

        int currentIndex = arr.length - 1;

        for (int i = 0; i <= (arr.length - 1); currentIndex--, i++) {
            result[currentIndex] = arr[i];
        }
        return result;
    }
}