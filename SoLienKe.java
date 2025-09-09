import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            long number = sc.nextLong();
            String str_n = String.valueOf(number);
            boolean tm = true;

            for (int i = 0; i < str_n.length() - 1; i++) {
                int num_i = str_n.charAt(i) - '0';
                int num_next_i = str_n.charAt(i + 1) - '0';

                if (num_i + 1 != num_next_i && num_i - 1 != num_next_i) {
                    tm = false;
                    break; 
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
