import java.util.*;

public class UocSoNgToLonNhat {
    public static long timUocSoNgToLonNhat(long n) {

        long maxPrime = -1;
        
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        
        if (n > 1) {
            maxPrime = n;
        }
        
        return maxPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            System.out.println(timUocSoNgToLonNhat(N));
        }
        sc.close();
    }
}
