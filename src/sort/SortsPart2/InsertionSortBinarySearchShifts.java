package sort.SortsPart2;

public class InsertionSortBinarySearchShifts {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 2, 3, 1, 2, 3, 4, 2, 3, 2, 43, 34, 3, 3};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int k = binSearchRight(a, 0, i - 1, a[i]);
            for (int j = i; j > k; j--) {
                swap(a, j, j - 1);
            }
        }
    }

    private static int binSearchRight(int[] a, int left, int right, int key) {
        int l = left - 1;
        int r = right + 1;
        while (l < r - 1) {
            int mid = (l + r) / 2;
            if (a[mid] <= key) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l + 1;
    }

    private static void swap(int[] a, int p, int q) {
        int tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }

    private static void print(int[] a){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
