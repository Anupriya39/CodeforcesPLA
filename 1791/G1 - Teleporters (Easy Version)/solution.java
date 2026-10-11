import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
 
            long[] costs = new long[n];
 
            st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(st.nextToken());
                costs[i] = a + (i + 1);
            }
 
            Arrays.sort(costs);
 
            int count = 0;
 
            for (long cost : costs) {
                if (c >= cost) {
                    c -= cost;
                    count++;
                } else {
                    break;
                }
            }
 
            System.out.println(count);
        }
    }
}