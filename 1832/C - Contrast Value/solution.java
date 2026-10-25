import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            // Remove consecutive duplicates
            int[] b = new int[n];
            int m = 0;
 
            for (int i = 0; i < n; i++) {
                if (m == 0 || a[i] != b[m - 1]) {
                    b[m++] = a[i];
                }
            }
 
            // Count endpoints and direction changes
            int ans = 1;
 
            for (int i = 1; i < m - 1; i++) {
                if ((b[i] > b[i - 1] && b[i] > b[i + 1]) ||
                    (b[i] < b[i - 1] && b[i] < b[i + 1])) {
                    ans++;
                }
            }
 
            if (m > 1) {
                ans++;
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}