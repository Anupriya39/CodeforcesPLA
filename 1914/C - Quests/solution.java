import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
 
            long[] a = new long[n];
            long[] b = new long[n];
 
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(st.nextToken());
            }
 
            long answer = 0;
            long prefixSum = 0;
            long maxB = 0;
 
            int limit = Math.min(n, k);
 
            for (int i = 0; i < limit; i++) {
                prefixSum += a[i];
                maxB = Math.max(maxB, b[i]);
 
                long remaining = k - (i + 1);
 
                long total = prefixSum + remaining * maxB;
 
                answer = Math.max(answer, total);
            }
 
            System.out.println(answer);
        }
    }
}