import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args){
        int[] numbers = {5, 6, 9, 1, 2, 8, 3, 7, 4};

        System.out.println("До сортировки: " + Arrays.toString(numbers));

        Sort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    private static void merge(int[] arr, int[] left, int[] right){
        int x = 0;
        int y = 0;
        int z = 0;

        while (x < left.length && y < right.length){
            if (left[x] <= right[y]){
                arr[z++] = left[x++];
            } else {
                arr[z++] = right[y++];
            }
        }

        while (x < left.length){
            arr[z++] = left[x++];
        }
        while (y < right.length){
            arr[z++] = right[y++];
        }
    }

    private static void Sort(int[] arr){
        if (arr.length < 2){
            return;
        }
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        Sort(left);
        Sort(right);

        merge(arr, left, right);
    }
}
