package sort.SortsPart1;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        quickSort(a, 0, a.length - 1);
        print(a);
    }

    private static int partition(int a[], int left, int right) {
        int i = left;
        int j = right;
        int mid = a[left + (right - left + 1) / 2];
        while (i <= j) {
            while (a[i] < mid)
                i++;
            while (a[j] > mid)
                j--;
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return j;
    }

    public static int[] quickSort(int a[], int left, int right) {
        if (left >= right) return null;
        int index = partition(a, left, right);
        quickSort(a, left, index);
        quickSort(a, index + 1, right);
        return a;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}