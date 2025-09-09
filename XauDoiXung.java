import java.util.Scanner;

public class XauDoiXung {
    public static boolean check(String s) {
        int len = s.length();
        int count = 0;

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                count++;
            }
        }

        if (count == 1) return true;
        if (count == 0 && len % 2 == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
