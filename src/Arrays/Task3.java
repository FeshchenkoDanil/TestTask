package Arrays;


public class Task3 {
    public static void main(String[] args) {
        System.out.print("Задание 3 ");
        System.out.println(indexMinElement(new int[]{3,2,1,4}));
    }

    public static int indexMinElement(int[] arr) {

        int result = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                result = i;
                minValue = arr[i];
            }
        }
        return result ;
    }
}