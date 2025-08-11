import java.util.*;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 
        
        for (int t = 0; t < T; t++) {
            String num = sc.nextLine().trim();
            StringBuilder result = new StringBuilder();
            boolean valid = true;
            
            for (char c : num.toCharArray()) {
                switch (c) {
                    case '0': result.append('0'); break;
                    case '1': result.append('1'); break;
                    case '8': result.append('0'); break;
                    case '9': result.append('0'); break;
                    default: valid = false; break;
                }
                if (!valid) break;
            }
            
            if (!valid) {
                System.out.println("INVALID");
                continue;
            }
            
            String resStr = result.toString().replaceFirst("^0+", "");
            
            if (resStr.isEmpty()) {
                System.out.println("INVALID");
            } else {
                System.out.println(resStr);
            }
        }
        sc.close();
    }
}
