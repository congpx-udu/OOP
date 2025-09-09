import java.util.Scanner;

public class SoDep2 {
    public static boolean kTDauCuoi(String n) {
        return n.charAt(0) == '8' && n.charAt(n.length() - 1) == '8';
    }

    public static boolean chiaHet10(String n) {
        long tong = 0;
        for (int i = 0; i < n.length(); i++) {
            tong += n.charAt(i) - '0';
        }
        return tong % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            if (kTDauCuoi(n) && chiaHet10(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
