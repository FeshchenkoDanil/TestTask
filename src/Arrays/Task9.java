package Arrays;


public class Task9 {
    public static void main(String[] args) {
        System.out.print("Задание 9 ");
        System.out.println(bubbleSort(new int[]{3,2,1,4}));
        System.out.println(selectionSort(new int[]{3,2,1,4}));
        System.out.println(insertionSort(new int[]{3,2,1,4}));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int lengthIn = arr.length; lengthIn > 0; lengthIn--) {
            for (int currSwap = 0; currSwap < lengthIn - 1; currSwap++) {
                if (arr[currSwap] > arr[currSwap + 1]) {

                    int curElement = arr[currSwap];

                    arr[currSwap] = arr[currSwap + 1];
                    arr[currSwap + 1] = curElement;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int min;

        for (int OutIterations = 0; OutIterations < arr.length - 1; OutIterations++) {

            min = OutIterations;

            for (int CountInIterations = OutIterations; CountInIterations < arr.length; CountInIterations++) {

                if (arr[CountInIterations] < arr[min]) {

                    min = CountInIterations;
                }
            }

            int temp = arr[OutIterations];

            arr[OutIterations] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        {
            int j, value;

            for (int i = 1; i < arr.length; i++) {
                value = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > value; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = value;
            }
        }
        return arr;
    }

}