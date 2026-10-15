import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();
 
            long[] a = new long[n];
            boolean possible = true;
 
            for (int i = 1; i <= n; i++) {
                long value = ((l + i - 1) / i) * i;
 
                if (value > r) {
                    possible = false;
                    break;
                }
 
                a[i - 1] = value;
            }
 
            if (!possible) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
 
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + (i == n - 1 ? "
" : " "));
                }
            }
        }
 
        sc.close();
    }
}