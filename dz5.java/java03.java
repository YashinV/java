
import java.util.Arrays;

public class java03 {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        int[] array = {1, 24, 3, 56, 789, -5, 12, 45};

        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.print("HeapSort: ");
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void heapSort(int[] array) {
        int n = array.length;

       
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

       
        for (int i = n - 1; i >= 0; i--) {
       
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;


            heapify(array, i, 0);
        }
    }

    static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < n && array[left] > array[largest])
            largest = left;


        if (right < n && array[right] > array[largest])
            largest = right;


        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;


            heapify(array, n, largest);

        }
    }

}