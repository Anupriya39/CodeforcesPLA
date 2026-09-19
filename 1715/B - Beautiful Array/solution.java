import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
 
            long base = b * k;
            long max = base + n * (k - 1);
 
            if (s < base || s > max) {
                System.out.println(-1);
                continue;
            }
 
            long[] a = new long[n];
            a[0] = base;
 
            long rem = s - base;
 
            for (int i = 0; i < n && rem > 0; i++) {
                long add = Math.min(rem, k - 1);
                a[i] += add;
                rem -= add;
            }
 
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "
" : " "));
            }
        }
 
        sc.close();
    }
}