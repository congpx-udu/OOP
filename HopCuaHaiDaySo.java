import java.util.ArrayList;
import java.util.Scanner;

public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            if (A.contains(a[i])) {
                continue;
            }
            else {
                A.add(a[i]);
            }
        }

        for(int i = 0; i < n; i++) {
            if (B.contains(b[i])) {
                continue;
            }
            else {
                B.add(b[i]);
            }
        }

        for(int i = 0; i < B.size(); i++) {
            if(!A.contains(B.get(i))){
                A.add(B.get(i));
            }
        }

        A.sort(null);

        for (int num : A) {
            System.out.print(num + " ");
        }

        sc.close();
    } 
}
