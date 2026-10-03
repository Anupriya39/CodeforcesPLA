import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            long[] a = new long[n];
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            long answer = 0;
 
            // k = number of boxes per truck
            for (int k = 1; k <= n; k++) {
 
                // k must divide n
                if (n % k != 0) {
                    continue;
                }
 
                long minSum = Long.MAX_VALUE;
                long maxSum = Long.MIN_VALUE;
 
                // Calculate sum of every group of k boxes
                for (int start = 0; start < n; start += k) {
                    long sum = 0;
 
                    for (int j = start; j < start + k; j++) {
                        sum += a[j];
                    }
 
                    minSum = Math.min(minSum, sum);
                    maxSum = Math.max(maxSum, sum);
                }
 
                answer = Math.max(answer, maxSum - minSum);
            }
 
            System.out.println(answer);
        }
    }
}