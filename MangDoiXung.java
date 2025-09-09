import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean tm = true;
            int[] arr = new int[n];
            int[] arr_rv = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr_rv[i] = arr[n-i-1];
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] != arr_rv[i]) {
                    tm = false;
                    break;
                }
                
            }
            if (tm) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
