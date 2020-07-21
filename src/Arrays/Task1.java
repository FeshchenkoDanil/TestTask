package Arrays;


public class Task1
{
    public static void main(String[] args)
    {
        System.out.print("Задание 1 ");
        System.out.println(minElement(new int[]{1,2,3,4}));
    }

    public static int minElement(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min  = arr[i];
            }
        }
        return min;
    }
}