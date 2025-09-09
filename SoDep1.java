import java.util.Scanner;

public class SoDep1 {
    // Kiểm tra toàn chữ số chẵn
    public static boolean kTraChanLe(String n) {
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0'; 
            if (digit % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean thuanNghich(String n) {
        String rv_n = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            rv_n += n.charAt(i);
        }
        return n.equals(rv_n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            if (kTraChanLe(n) && thuanNghich(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
