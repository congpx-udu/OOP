import java.util.*;

public class TongGiaiThua {
    public static long GiaiThua(int n) {
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += GiaiThua(i);
        }
        System.out.println(tong);
        sc.close();
    }
}
