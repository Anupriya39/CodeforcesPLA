import java.io.*;
import java.util.*;
 
public class Main {
 
    static long distance(long x1, long y1, long x2, long y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken()) - 1;
            int tCity = Integer.parseInt(st.nextToken()) - 1;
 
            long[] x = new long[n];
            long[] y = new long[n];
 
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
 
                x[i] = Long.parseLong(st.nextToken());
                y[i] = Long.parseLong(st.nextToken());
            }
 
            // Direct flight
            long answer = distance(x[s], y[s], x[tCity], y[tCity]);
 
            // If there are major cities
            if (k > 0) {
                long startToMajor = Long.MAX_VALUE;
                long majorToEnd = Long.MAX_VALUE;
 
                // First k cities are major cities
                for (int i = 0; i < k; i++) {
                    startToMajor = Math.min(
                        startToMajor,
                        distance(x[s], y[s], x[i], y[i])
                    );
 
                    majorToEnd = Math.min(
                        majorToEnd,
                        distance(x[tCity], y[tCity], x[i], y[i])
                    );
                }
 
                // s -> major -> major -> t
                answer = Math.min(
                    answer,
                    startToMajor + majorToEnd
                );
            }
 
            System.out.println(answer);
        }
    }
}