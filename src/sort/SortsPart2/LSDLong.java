package sort.SortsPart2;

public class LSDLong {

    // максимальное количество элементов
    private static final int MAX_SIZE = 25;

    public static void main(String[] args) {
        // отрицательные нельзя
        long[] a = {1, 2, 54, 76, 98, 54, 4, 65, 5, 51, 49, 0, 0, 21};
        LSD(a);
        print(a);
    }


    public static long[] LSD(long[] a) {
        int i;
        long m = a[0];
        int exp = 1;
        int n = a.length;
        long[] b = new long[MAX_SIZE];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0) {
            long[] bucket = new long[MAX_SIZE];
            for (i = 0; i < n; i++)
                bucket[(int) (a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--) {
                int x = (int) (a[i] / exp);
                int index = (int) --bucket[x % 10];
                b[index] = a[i];
            }
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;
        }
        return a;
    }

    private static void print(long[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
