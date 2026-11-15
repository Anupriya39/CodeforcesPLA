import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n + 1];
            int[] next = new int[n + 1];
 
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
 
            next[n] = -1;
 
            for (int i = n - 1; i >= 1; i--) {
                if (a[i] != a[i + 1]) {
                    next[i] = i + 1;
                } else {
                    next[i] = next[i + 1];
                }
            }
 
            int q = sc.nextInt();
 
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
 
                if (next[l] != -1 && next[l] <= r) {
                    out.append(l).append(" ").append(next[l]).append('
');
                } else {
                    out.append("-1 -1
");
                }
            }
        }
 
        System.out.print(out);
        sc.close();
    }
}