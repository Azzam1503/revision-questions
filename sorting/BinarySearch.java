package sorting;

public class BinarySearch {

    public static int binraySearch(int arr[], int target) {
        int ei = arr.length - 1;
        int si = 0;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] > target) {
                ei = mid - 1;
            } else if (arr[mid] < target) {
                si = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 8, 9, 11 };
        int ans = binraySearchWithRecursion(arr, 7, 0, arr.length - 1);
        System.out.println(ans);

    }

    private static int binraySearchWithRecursion(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = (s + e) / 2;
        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target) {
            return binraySearchWithRecursion(arr, target, mid + 1, e);
        }
        return binraySearchWithRecursion(arr, target, s, mid - 1);
    }
}
