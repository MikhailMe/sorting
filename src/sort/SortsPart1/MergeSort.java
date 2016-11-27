package sort.SortsPart1;

import java.util.Scanner;

public class MergeSort {

    public static pair[] elem;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pair[] a = new pair[n];
        for (int i = 0; i < n; i++) {
            pair temp = new pair();
            temp.k = in.nextInt();
            temp.v = in.nextInt();
            a[i] = temp;
        }
        mergeSort(a);
        print(a);
    }

    private static void print(pair[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i].k + " " + a[i].v);
    }

    public static boolean mergeSort(pair[] a) {
        elem = new pair[a.length];
        split(a, elem, 0, a.length - 1);
        return true;
    }

    private static void split(pair[] a, pair[] t, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            split(a, t, left, mid);
            split(a, t, mid + 1, right);
            merge(a, t, left, right, mid);
        }
    }

    private static void merge(pair[] a, pair[] b, int left, int right, int mid) {
        int Left = left;
        int Right = mid + 1;
        for (int i = left; i <= right; i++) {
            if (Left > mid) {
                b[i] = a[Right++];
            } else if (Right > right) {
                b[i] = a[Left++];
            } else if (a[Left].k <= a[Right].k) {
                b[i] = a[Left++];
            } else {
                b[i] = a[Right++];
            }
        }
        for (int i = left; i <= right; i++) {
            a[i] = b[i];
        }
    }

    static class pair {
        int k;
        int v;
    }
}