import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
 
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
 
            long[] a = new long[n];
 
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            Arrays.sort(a);
 
            // Prefix sum
            long[] prefix = new long[n + 1];
 
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + a[i];
            }
 
            long answer = Long.MIN_VALUE;
 
            // i = number of operations removing two minimums
            for (int i = 0; i <= k; i++) {
 
                int left = 2 * i;
 
                // Number of maximum elements removed
                int removeMax = k - i;
 
                int right = n - removeMax;
 
                // Sum of a[left ... right-1]
                long sum = prefix[right] - prefix[left];
 
                answer = Math.max(answer, sum);
            }
 
            System.out.println(answer);
        }
    }
}