import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            // Max-heap containing the smallest (m-1) elements
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
 
            long sum = 0;
            long ans = Long.MIN_VALUE;
 
            for (int i = 0; i < n; i++) {
 
                // a[i] can be the last selected element
                if (pq.size() == m - 1) {
                    long score = (long) m * a[i] - sum;
                    ans = Math.max(ans, score);
                }
 
                // Add current element to the pool for future positions
                pq.add(a[i]);
                sum += a[i];
 
                // Keep only the smallest m-1 elements
                if (pq.size() > m - 1) {
                    sum -= pq.poll();
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}