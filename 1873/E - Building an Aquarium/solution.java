import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
 
            long[] a = new long[n];
            long max = 0;
 
            st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                max = Math.max(max, a[i]);
            }
 
            long low = 1;
            long high = max + x;
            long answer = 1;
 
            while (low <= high) {
                long mid = low + (high - low) / 2;
 
                long water = 0;
 
                for (int i = 0; i < n; i++) {
                    if (a[i] < mid) {
                        water += mid - a[i];
 
                        // Avoid unnecessary calculations if already too much
                        if (water > x) {
                            break;
                        }
                    }
                }
 
                if (water <= x) {
                    answer = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
 
            System.out.println(answer);
        }
    }
}