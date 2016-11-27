package sort.SortsPart1;

import java.io.*;
import java.util.StringTokenizer;

public class CountingSort {

    private static FastScanner in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        try {
            in = new FastScanner(new File("input.txt"));
            out = new PrintWriter(new File("output.txt"));
            go();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void go() throws IOException {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        countingSort(a);
        print(a);
    }

    public static int[] countingSort(int[] a) {
        int min = min(a);
        for (int ind : a)
            ind -= min;
        int[] temp = new int[max(a) + 1];
        for (int ind : a)
            temp[ind]++;
        int current = 0;
        int ind = -1;
        while (ind < temp.length - 1) {
            while (temp[++ind] == 0) {
            }
            for (int j = 0; j < temp[ind]; j++)
                a[current++] = ind + min;
        }
        return a;
    }

    private static int min(int[] a) {
        int min = a[0];
        for (int ind : a)
            min = Math.min(ind, min);
        return min;
    }

    private static int max(int[] a){
        int max = 0;
        for (int ind : a)
            max = Math.max(ind, max);
        return max;
    }

    private static void print(int[] a) {
        for (int ind : a)
            out.print(ind + " ");
    }

    private static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}