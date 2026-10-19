import java.util.*;
 
public class Main {
 
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    static long findGcd(long[] a, int start) {
        long g = 0;
        for (int i = start; i < a.length; i += 2) {
            g = gcd(g, a[i]);
        }
        return g;
    }
 
    static boolean valid(long[] a, long x, int start) {
        for (int i = start; i < a.length; i += 2) {
            if (a[i] % x == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            long g1 = findGcd(a, 0);
            long g2 = findGcd(a, 1);
 
            if (g1 > 1 && valid(a, g1, 1)) {
                System.out.println(g1);
            } else if (g2 > 1 && valid(a, g2, 0)) {
                System.out.println(g2);
            } else {
                System.out.println(0);
            }
        }
 
        sc.close();
    }
}