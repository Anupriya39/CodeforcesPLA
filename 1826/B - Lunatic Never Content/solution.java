import java.io.*;
import java.util.*;
 
public class Main {
 
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
 
            long[] a = new long[n];
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            long ans = 0;
 
            for (int i = 0; i < n / 2; i++) {
                long diff = Math.abs(a[i] - a[n - 1 - i]);
                ans = gcd(ans, diff);
            }
 
            System.out.println(ans);
        }
    }
}