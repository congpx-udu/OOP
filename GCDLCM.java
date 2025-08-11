import java.util.Scanner;

public class GCDLCM {
    public static long Gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println( (a*b)/Gcd(a,b) + " " + Gcd(a,b) );
        }

        sc.close();
    } 
}
