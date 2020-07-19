import java.util.Arrays;

public class Array
{

    public static class SimpleArray
    {

        //  Найти минимальный элемент массива
        public static int minElement(int[] arr) {
            int response = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < response) {
                    response = arr[i];
                }
            }
            return response;
        }

        //  Найти максимальный элемент массива
        public static int maxElement(int[] arr) {
            int response = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > response) {
                    response = arr[i];
                }
            }
            return response;
        }

        //  Найти индекс минимального элемента массива
        public static int indexMinElement(int[] arr) {
            int response = 0, minValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    response = i;
                    minValue = arr[i];
                }
            }
            return response;
        }

        //  Найти индекс максимального элемента массива
        public static int indexMaxElement(int[] arr) {
            int response = 0, maxValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    response = i;
                    maxValue = arr[i];
                }
            }
            return response;
        }

        //  Посчитать сумму элементов массива с нечетными индексами
        public static int sumElementsOddIndex(int[] arr) {
            int response = 0;
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 == 0) {
                    response += arr[i];
                }
            }
            return response;
        }

        //  Сделать реверс массива (массив в обратном направлении)
        public static int[] reversArray(int[] arr) {
            int response[] = new int[arr.length];
            int currentIndex = arr.length - 1;
            for (int i = 0; i <= (arr.length - 1); currentIndex--, i++) {
                response[currentIndex] = arr[i];
            }
            return response;
        }

        //  Посчитать количество нечетных элементов массива
        public static int countOddElements(int[] arr) {
            int response = 0;
            for (int currentElement : arr) {
                if (currentElement % 2 != 0) {
                    response++;
                }
            }
            return response;
        }

        //  Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
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


        //  Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
        public static int[] BubbleSort(int[] arr) {
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

        // QuickSort
        public int QuickSort(int[] array, int begin, int end) {
            int res = end;

            int counter = begin;
            for (int i = begin; i < end; i++) {
                if (array[i] < array[res]) {
                    int temp = array[counter];
                    array[counter] = array[i];
                    array[i] = temp;
                    counter++;
                }
            }
            int temp = array[res];
            array[res] = array[counter];
            array[counter] = temp;

            return counter;
        }

        //Merge sort

        public static void SortUnsorted(int[] a, int lo, int hi) {

            if (hi <= lo)
                return;
            int mid = lo + (hi - lo) / 2;
            SortUnsorted(a, lo, mid);
            SortUnsorted(a, mid + 1, hi);

            int[] buf = Arrays.copyOf(a, a.length);

            for (int k = lo; k <= hi; k++)
                buf[k] = a[k];

            int i = lo, j = mid + 1;
            for (int k = lo; k <= hi; k++) {

                if (i > mid) {
                    a[k] = buf[j];
                    j++;
                } else if (j > hi) {
                    a[k] = buf[i];
                    i++;
                } else if (buf[j] < buf[i]) {
                    a[k] = buf[j];
                    j++;
                } else {
                    a[k] = buf[i];
                    i++;
                }
            }

        }


        //Shell sort

        private static void ShellSort(int[] array, int h) {
            for (int step = h / 2; step > 0; step /= 2) {
                for (int i = step; i < h; i++) {
                    for (int j = i - step; j >= 0 && array[j] > array[j + step] ; j -= step) {
                        int x = array[j];
                        array[j] = array[j + step];
                        array[j + step] = x;
                    }
                }
            }
        }

        // Heap Sort

        public static int[] heapSort(int[] arr) {

            buildheap(arr);
            int sizeOfHeap=arr.length-1;
            for(int i=sizeOfHeap; i>0; i--) {
                exchange(arr,0, i);
                sizeOfHeap=sizeOfHeap-1;
                heapify(arr, 0,sizeOfHeap);
            }
            return arr;
        }

        public static void heapify(int[] arr, int i, int size) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int max;
            if (left <= size && arr[left] > arr[i]) {
                max = left;
            } else {
                max = i;
            }

            if (right <= size && arr[right] > arr[max]) {
                max = right;
            }

            if (max != i) {
                heapify(arr, max, size);
            }
        }

        public static void buildheap(int []arr) {
            for(int i=(arr.length-1)/2; i>=0; i--){
                heapify(arr,i,arr.length-1);
            }
        }
        public static void exchange(int[] arr,int i, int j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }





    }



}