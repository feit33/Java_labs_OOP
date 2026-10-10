import java.util.Arrays;

public class insertSort {
    public static void main(String args[]){
        int[] numbers = {5, 4, 9, 18, 27, 1, 10, 7, 16};
        System.out.println("До сортировки: " + Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
