import java.io.*;
import java.util.*;
 
public class Main {
 
    static long n, c;
    static long[] a;
 
    static boolean possible(long w) {
        long sum = 0;
 
        for (long x : a) {
            long side = x + 2 * w;
            sum += side * side;
 
            // No need to continue if already too large
            if (sum > c) {
                return false;
            }
        }
 
        return sum <= c;
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            n = Long.parseLong(st.nextToken());
            c = Long.parseLong(st.nextToken());
 
            a = new long[(int) n];
 
            st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            long low = 0;
            long high = 1_000_000_000L;
 
            while (low <= high) {
                long mid = low + (high - low) / 2;
 
                if (possible(mid)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
 
            System.out.println(high);
        }
    }
}