package sorting;

public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int p = partition(arr, si, ei);
        quickSort(arr, si, p - 1);
        quickSort(arr, p + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[si];
        int pivotCount = 0;
        for (int i = si + 1; i <= ei; i++) {
            if (arr[i] <= pivot) {
                pivotCount++;
            }
        }
        int pivotIndex = si + pivotCount;
        arr[si] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i = si, j = ei;

        while (i < pivotCount && j > pivotIndex) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                j--;
                i++;
            }
        }

        return pivotIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 6, 7, 3 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
