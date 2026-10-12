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
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long total = 0;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];
            }
 
            long prefix = 0;
            long answer = 0;
 
            for (int i = 0; i < n - 1; i++) {
                prefix += a[i];
                answer = Math.max(answer, gcd(prefix, total));
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}