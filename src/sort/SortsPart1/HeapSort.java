package sort.SortsPart1;

import java.util.Scanner;

public class HeapSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        heapSort(a);
        print(a);
    }


    public static int[] heapSort(int[] a) {
        int size = a.length;
        int floor = 1;
        while (2 * floor < a.length) {
            floor *= 2;
        }
        floor -= 2;
        for (int i = floor; i >= 0; i--) {
            siftDown(a, i, size);
        }
        int temp;
        while (size > 1) {
            temp = a[0];
            a[0] = a[size - 1];
            a[size - 1] = temp;
            size--;
            siftDown(a, 0, size);
        }
        return a;
    }

    private static void siftDown(int[] a, int dig, int size) {
        int left = 2 * dig + 1;
        int right = left + 1;
        if (right < size) {
            int max = max(a, left, right);
            if (a[dig] < a[max]) {
                swap(a, dig, max);
                siftDown(a, max, size);
            }
        } else if (left < size) {
            if (a[left] > a[dig]) {
                swap(a, dig, left);
            }
        }
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    private static int max(int[] a, int l, int r) {
        return a[l] > a[r] ? l : r;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}