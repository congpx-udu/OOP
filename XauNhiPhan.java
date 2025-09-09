import java.util.*;

public class XauNhiPhan {
    static long[] len = new long[94]; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        len[1] = 1;
        len[2] = 1;
        for (int i = 3; i <= 93; i++) {
            len[i] = len[i - 2] + len[i - 1];
        }

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(findChar(n, k));
        }

        sc.close();
    }

    static char findChar(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';

        if (k <= len[n - 2]) {
            return findChar(n - 2, k);
        } else {
            return findChar(n - 1, k - len[n - 2]);
        }
    }
}
