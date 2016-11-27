package sort.SortsPart2;

import java.util.Arrays;
import java.util.Random;

public class KthOrderStatisticMedON {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 4, 2, 2};
        for (int i = 0; i < a.length; i++) {
            System.out.print(find(a, i, new Random()) + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int find(int[] a, int k, Random random) {
        int left = 0;
        int right = a.length - 1;
        while (true) {
            int pivot = left + random.nextInt(right - left + 1);
            int idx = partition(a, left, right, pivot);
            if (idx < k) {
                left = idx + 1;
            } else if (idx > k) {
                right = idx - 1;
            } else {
                return a[idx];
            }
        }
    }

    private static int partition(int[] a, int left, int right, int pivot) {
        if (left > right) {
            return right;
        }
        int x = a[pivot];
        swap(a, pivot, right);
        int i = left;
        int j = right - 1;
        while (i <= j) {
            while (i <= j && a[i] < x) {
                i++;
            }
            while (i <= j && a[j] > x) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(a, i++, j--);
        }
        swap(a, i, right);
        return i;
    }

    private static void swap(int[] a, int p, int q) {
        int tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;

    }
}
