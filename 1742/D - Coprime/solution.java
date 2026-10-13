import java.util.*;
 
public class Main {
 
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] last = new int[1001];
 
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                last[x] = i;
            }
 
            int ans = -1;
 
            for (int x = 1; x <= 1000; x++) {
                if (last[x] == 0) continue;
 
                for (int y = 1; y <= 1000; y++) {
                    if (last[y] == 0) continue;
 
                    if (gcd(x, y) == 1) {
                        ans = Math.max(ans, last[x] + last[y]);
                    }
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}