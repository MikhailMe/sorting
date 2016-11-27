package sort.SortsPart2;

import static sort.SortsPart1.Helper.swap;

public class KthOrderStatisticWorstON {
    public static int find(int[] a, int k) {
        if ((k < 0) || (k >= a.length)) {
            System.out.println("Incorrect input for variable k");
            return 0;
        }
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int pivotIdx = pivot(a, left, right);
            int idx = partition(a, left, right, pivotIdx);
            if (k < idx) {
                right = idx - 1;
            } else if (k > idx) {
                left = idx + 1;
            } else {
                return a[idx];
            }
        }
        return a[left];
    }

    static int partition(int[] a, int left, int right, int pivot) {
        if (left > right) {
            return right;
        }
        int x = a[pivot];
        int i = left;
        int j = right;
        swap(a, j--, pivot);
        while (i <= j) {
            while (i <= j && a[i] < x) i++;
            while (i <= j && a[j] > x) j--;
            if (i >= j) break;
            swap(a, i++, j--);
        }
        swap(a, i, right);
        return i;
    }

    static int pivot(int[] a, int left, int right) {
        int len = 5;
        int count = 0;
        int length = right - left + 1;
        for (int i = left; i < right - len + 2; i += len) {
            bubbleSort(a, i, len, 1);
            count++;
        }
        int remainder = length % len;
        bubbleSort(a, right - remainder + 1, remainder, 1);
        count++;

        int index = left + len / 2 + len * ((count - 1 )/ 2);

        bubbleSort(a, left + len / 2, length - remainder - len + 1, len);
        if (remainder > 0) {
            int i = right - (remainder - 1) / 2;
            if (count <= 2) {
                index = i;
            }
            int j = right - remainder - len / 2;
            while ((j >= left) && (a[j] > a[i])) {
                swap(a, j, i);
                i = j;
                j -= len;
            }
        }
        return index;
    }

    private static void bubbleSort(int[] a, int left, int count, int dist) {
        boolean wasSwap = true;
        int i = 0;
        while (wasSwap) {
            wasSwap = false;
            for (int j = left; j < left + count - i - 1; j += dist) {
                if (a[j] > a[j + dist]) {
                    wasSwap = true;
                    swap(a, j, j + dist);
                }
            }
            i += dist;
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
