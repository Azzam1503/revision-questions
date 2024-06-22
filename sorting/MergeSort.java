package sorting;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = (si + ei) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei);
    };

    public static void merge(int arr[], int si, int ei) {
        int ans[] = new int[ei - si + 1];
        int mid = (si + ei) / 2;
        int k = 0;

        int i = si, j = mid + 1;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                k++;
                i++;
            } else {
                ans[k] = arr[j];
                k++;
                j++;
            }
        }
        ;

        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        ;

        while (j <= ei) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        ;
        k = 0;
        for (int l = si; l <= ei; l++) {
            arr[l] = ans[k];
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 9, 3, 7, 4, 2, 3, 8, 9, 1 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
