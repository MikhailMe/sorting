package sort.SortsPart1;

import java.util.Scanner;

public class AntiQuickSort {

    public static void main(String[] args) {
        antiQuickSort();
    }

    public static int[] antiQuickSort() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        for (int i = 2; i < n; i++) {
            swap(a, i, i / 2);
        }
        print(a);
        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}