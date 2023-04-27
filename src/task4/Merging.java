package task4;

public class Merging {

    public static void test() {
        int[] p = {1, 3, 5, 7, 9, 0, 0, 0, 0}; // assuming 0's are empty spaces
        int[] q = {2, 4, 6, 8};

        merge(p, q, 5, 4); // first 5 elements in p are valid, q has 4 elements

        // print merged array
        for (int i : p) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] p, int[] q, int m, int n) {
        int i = m - 1; // last element of p's valid part
        int j = n - 1; // last element of q
        int k = m + n - 1; // last element of p's total length

        while (j >= 0) {
            if (i >= 0 && p[i] > q[j]) {
                p[k] = p[i];
                i--;
            } else {
                p[k] = q[j];
                j--;
            }
            k--;
        }
    }
}
