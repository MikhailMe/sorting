package sort.SortsPart2;

//fixme
public class MergeSortWithoutAdditionalMemory {

    public static void main(String[] args) {
        int[] a = {-11, 0, 2, 5, 9, 10, 53, 1, 2, 3, 4, 5, 6, 7, 12, 17};
        sort(a);
        //print(a);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 4 == 0)
                System.out.print("   ");
        }
        System.out.println();
    }

    private static void sort(int[] array) {
        print(array);
        int n = array.length;
        System.out.println("n = " + n);

        int len = (int) Math.sqrt(n);
        System.out.println("len = " + len);

        int mid = findMid(array);
        System.out.println("mid = " + mid);

        int amountOfBlocks = (int) Math.floor(n / len);
        System.out.println("amountOfBlocks = " + amountOfBlocks);


        int numberOfBlockFirstSequence = findEndFirstString(array, n, len) / len + 1;
        System.out.println("numberOfBlockFirstSequence = " + numberOfBlockFirstSequence);

        int firstIndexFirstSequence = (numberOfBlockFirstSequence - 1) * len;
        System.out.println("firstIndexFirstSequence = " + firstIndexFirstSequence);

        int firstIndexLastBlock = (amountOfBlocks - 1) * len;
        System.out.println("firstIndexLastBlock = " + firstIndexLastBlock);

        swapBlocks(array, len, firstIndexFirstSequence, firstIndexLastBlock);
        print(array);

        sortBlockByFirstElement(array, len, amountOfBlocks);
        print(array);
    }

    private static int findMid(int[] array) {
        for (int i = 0; i < array.length - 1; ++i)
            if (array[i] <= array[i + 1])
                continue;
            else return i;
        return 0;
    }

    private static int findEndFirstString(int[] array, int n, int len) {
        for (int i = 0; i < n - 1; ++i) {
            int k = len * i;
            for (int j = k; j < k + len; ++j) {
                if (array[j] < array[j + 1])
                    continue;
                else return j;
            }
        }
        return 0;
    }

    private static void swapBlocks(int[] array, int len, int a, int b) {
        int temp;
        for (int i = 0; i < len; ++i) {
            temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            a++;
            b++;
        }
    }

    private static int findMinBlock(int[] array, int len, int amountOfBlocks, int index) {
        int min = Integer.MAX_VALUE;
        int indexMin = -1;
        int k = index * len;
        int j = 0;
        for (int i = index; i < amountOfBlocks; ++i){
            if (array[k + len*j] < min){
                min = array[i * len];
                indexMin = i * len;
            }
            j++;
        }
        return indexMin;
    }

    private static void sortBlockByFirstElement(int[] array, int len, int amountOfBlocks) {
        int min;
        for (int i = 0; i < amountOfBlocks; ++i) {
            min = findMinBlock(array, len, amountOfBlocks, i);
            swapBlocks(array, len, i * len, min);
        }
    }
}