import java.util.*;
 
public class Main {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int ans = 0;
 
            for (int i = 1; i <= n; i++) {
                int p = sc.nextInt();
 
                if (p != i) {
                    ans = gcd(ans, Math.abs(p - i));
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}