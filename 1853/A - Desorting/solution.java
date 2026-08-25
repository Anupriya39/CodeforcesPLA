import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            boolean sorted = true;
            long minDiff = Long.MAX_VALUE;
 
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    sorted = false;
                    break;
                }
 
                minDiff = Math.min(minDiff, a[i + 1] - a[i]);
            }
 
            if (!sorted) {
                System.out.println(0);
            } else {
                System.out.println(minDiff / 2 + 1);
            }
        }
 
        sc.close();
    }
}