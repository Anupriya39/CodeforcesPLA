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
 
            long current = a[0];
            long answer = a[0];
 
            for (int i = 1; i < n; i++) {
 
                // Same parity -> cannot extend the subarray
                if ((a[i] & 1) == (a[i - 1] & 1)) {
                    current = a[i];
                } else {
                    // Different parity -> extend or start new
                    current = Math.max(a[i], current + a[i]);
                }
 
                answer = Math.max(answer, current);
            }
 
            System.out.println(answer);
        }
    }
}