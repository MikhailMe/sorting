package sort.SortsPart1;

import java.io.PrintWriter;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        out.println(bubbleSort(a, n));
        out.flush();
    }

    public static int bubbleSort(int[] a, int n) {
        int result = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    result++;
                }
            }
        }
        return result;
    }
}