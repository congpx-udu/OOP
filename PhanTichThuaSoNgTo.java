import java.util.Scanner;

public class PhanTichThuaSoNgTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            long n = sc.nextLong();
            System.out.print("Test " + t + ": ");
            for (long i = 2; i * i <= n; i++) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count > 0) {
                    System.out.print(i + "(" + count + ") ");
                }
            }
            if (n > 1) { 
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
        sc.close();
    }
}
