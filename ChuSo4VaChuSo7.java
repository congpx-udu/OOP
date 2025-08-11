import java.util.Scanner;

public class ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        String str = String.valueOf(number);

        int count4 = 0;
        int count7 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4') {
                count4++;
            } else if (str.charAt(i) == '7') {
                count7++;
            }
        }

        if (count4 + count7 == 4 || count4 + count7 == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
