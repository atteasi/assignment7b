package task3;

public class Josephus {
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            /*
             * The position returned by the (n - 1, k) call is relative to the sub-problem
             * of size n-1, so we need to adjust it to be relative to the original problem of size n.
             * We also need to account for the kth person being removed, hence the addition of k-1.
             */
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
}
