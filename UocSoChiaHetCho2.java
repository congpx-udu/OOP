import java.util.*;

public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            if (N % 2 != 0) {
                System.out.println(0); 
                continue;
            }
            long M = N / 2;
            long count = 0;
            for (long i = 1; i * i <= M; i++) {
                if (M % i == 0) {
                    count++; 
                    if (i != M / i) count++; 
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
