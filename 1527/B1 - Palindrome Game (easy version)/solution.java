import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int zeros = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                }
            }
 
            if (zeros == 1) {
                System.out.println("BOB");
            } else if (zeros % 2 == 0) {
                System.out.println("BOB");
            } else {
                System.out.println("ALICE");
            }
        }
 
        sc.close();
    }
}