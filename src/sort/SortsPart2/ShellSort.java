package sort.SortsPart2;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = {1,2,54,76,98,54,4,65,5432,35,324,6,7,67,3,6,2,6};
        shellSort(a);
        print(a);
    }

    public static int[] shellSort(int[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < n; i++) {
                for (int j = i; (j >= h) && (a[j] < a[j - h]); j -= h) {
                    swap (a, j, j - h);
                }
            }
            h /= 3;
        }
        return a;
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
