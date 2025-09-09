import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str_n = String.valueOf(n);
            boolean tm = true;

            for (int i = 0; i < str_n.length(); i++) {
                char ch = str_n.charAt(i);
                if (ch != '0' && ch != '1' && ch != '2') {
                    tm = false;

                }
            }

            if (tm) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
