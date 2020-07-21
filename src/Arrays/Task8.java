package Arrays;


public class Task8 {
    public static void main(String[] args) {
        System.out.print("Задание 8 ");
        System.out.println(replaceHalfArray(new int[]{3, 2, 1, 4}));

    }

    public static int[] replaceHalfArray(int[] arr) {

        int half = arr.length / 2;

        int div = half + arr.length % 2;

        for (int i = 0; i < div; i++) {
            int currentElement = arr[i];
            arr[i] = arr[div + i];
            arr[div + i] = currentElement;
        }
        return arr;
    }
}