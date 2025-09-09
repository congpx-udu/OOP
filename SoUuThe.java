import java.util.Scanner;

public class SoUuThe {

    public static int countOdd(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if ((n.charAt(i) - '0') % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countEven(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if ((n.charAt(i) - '0') % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean isDigit(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))) {
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

            if (!isDigit(n)) {
                System.out.println("INVALID");
            } else {
                int odd = countOdd(n);
                int even = countEven(n);
                int len = n.length();

                if (len % 2 == 0) {
                    System.out.println(even > odd ? "YES" : "NO");
                } else {
                    System.out.println(odd > even ? "YES" : "NO");
                }
            }
        }
        sc.close();
    }
}
