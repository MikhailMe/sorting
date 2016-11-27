package sort.SortsPart2;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {1,2,54,76,98,54,4,65,5432,35,324,6,7,67,3,6,2,6};
        insertionSort(a);
        print(a);
    }

    public static void insertionSort(int a[]) {
        if (a == null) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = i; (j > 0) && (a[j] < a[j - 1]); j--) {
                swap(a, j, j - 1);
            }
        }
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

