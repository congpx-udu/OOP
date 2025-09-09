import java.util.Scanner;

public class SoDep3 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean thuanNghich(String n) {
        return n.equals(new StringBuilder(n).reverse().toString());
    }

    public static boolean kTNTo(String n) {
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (!isPrime(digit)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            if (thuanNghich(n) && kTNTo(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
