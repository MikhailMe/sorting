package sort.SortsPart1;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(selectionSort2(a));
    }

    public static int selectionSort2(int[] a) {
        int amount = 0;
        int current = 0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;
            if (min != i) {
                swap(a, i, min);
                if (current == i) {
                    amount++;
                    current = min;
                } else if (current == min) {
                    amount++;
                    current = i;
                }
            }
        }
        return amount;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}