import java.util.Scanner;

public class TongUocSo {
    static final int MAX = 2000000;
    static int[] spf = new int[MAX + 1]; 

    static void sieve() {
        for (int i = 2; i <= MAX; i++) spf[i] = i; 
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }


    static long sumPrimeFactors(int x) {
        long sum = 0;
        while (x > 1) {
            sum += spf[x];
            x /= spf[x];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int N = sc.nextInt();
        long totalSum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            totalSum += sumPrimeFactors(num);
        }

        System.out.println(totalSum);
        sc.close();
    }
}
