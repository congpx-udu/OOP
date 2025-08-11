import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            double h = sc.nextDouble();

            for (int i = 1; i < n; i++) {
                double di = h * Math.sqrt((double) i / n);
                System.out.printf("%.6f", di);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
