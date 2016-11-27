package sort.SortsPart2;

public class MSDForStrings {

    private static final int bytesword = 3; // Количество разрядов в сравниваемых числах (в данном случае длина сравниваемых строк)
    private static final int R = 26; // Сиситема исчисления сравниваемых чисел (для маленьких букв лактинского алфавита - 26)
    private static final int M = 3; // Подмножества сортируемые вставками
    private static String[] aux;

    public static void main(String[] args) {
        String[] x = {"aza", "aba", "aab", "aad", "zba", "aac", "abd", "zzg", "zbz", "zze", "aag", "aaf", "abx", "zba", "aac"};
        //radixMSD(x, 0, 14, 0);
        for (int i = 0; i < 15; i++) {
            System.out.println(x[i] + " ");
        }
    }

    /*private static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    } +count[A]

    define bin(A) l

    private void radixMSD(Item a[], int l, int r, int d) {
        int i, j, count[ R + 1];

        if (d < bytesword) {
            if (r - l <= 3) {
                insertion(a, l, r);
            } else {
                for (j = 0; j < R + 1; j++) {
                    count[j] = 0;
                }

                for (i = l; i <= r; i++) {
                    count[a[i][d] + 1 - 'a']++;
                }

                for (j = 1; j < R; j++) {
                    count[j] += count[j - 1];
                }

                for (i = l; i <= r; i++) {
                    int tmp = count[a[i][d] - 'a']++;
                    aux[tmp] = a[i];
                }

                for (i = l; i <= r; i++) {
                    a[i] = aux[i - l];
                }

                radixMSD(a, l, l + count[0] - 1, d + 1);

                for (j = 0; j < R - 1; j++) {
                    radixMSD(a, bin(j), bin(j + 1) - 1, d + 1);
                }
            }
        }
    }

    void insertion(string a[], int l, int r) {
        int i;
        for (i = r; i > l; i--) {
            compexch(a[i - 1], a[i]);
        }

        for (i = l + 2; i <= r; i++) {
            int j = i;
            string v = a[i];
            while (strcmp(v.c_str(), a[j - 1].c_str()) < 0) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = v;
        }
    }*/

    void compexch(String A, String B) {
        if (!A.equals(B)) {

            String tmp;
            tmp = A;
            A = B;
            B = tmp;
        }
    }


}
