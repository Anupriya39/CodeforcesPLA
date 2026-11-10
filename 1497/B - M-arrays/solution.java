import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int[] freq = new int[m];
 
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                freq[a % m]++;
            }
 
            int ans = 0;
 
            if (freq[0] > 0) {
                ans++;
            }
 
            for (int i = 1; i <= m / 2; i++) {
                if (i == m - i) {
                    if (freq[i] > 0) {
                        ans++;
                    }
                } else {
                    int x = freq[i];
                    int y = freq[m - i];
 
                    if (x == 0 && y == 0) {
                        continue;
                    }
 
                    ans += Math.max(1, Math.abs(x - y));
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}