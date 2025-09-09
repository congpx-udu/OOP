import java.util.Scanner;

public class SoXaCach {

    static int n;
    static int[] cur;        
    static boolean[] used;   

    public static void backtrack(int pos) {
        if (pos == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(cur[i]);
            }
            System.out.println();
            return;
        }
        for (int d = 1; d <= n; d++) {
            if (used[d]) continue;               
            if (pos > 0 && Math.abs(cur[pos-1] - d) == 1) continue; 
            used[d] = true;
            cur[pos] = d;
            backtrack(pos + 1);
            used[d] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            cur = new int[n];
            used = new boolean[n+1];
            backtrack(0);
            System.out.println(); 
        }
        sc.close();
    }
}
