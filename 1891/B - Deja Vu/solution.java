import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
 
            long[] a = new long[n];
 
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            // Keep only useful queries:
            // x must be strictly smaller than the previous useful x.
            ArrayList<Integer> queries = new ArrayList<>();
 
            st = new StringTokenizer(br.readLine());
 
            int last = 31;
 
            for (int i = 0; i < q; i++) {
                int x = Integer.parseInt(st.nextToken());
 
                if (x < last) {
                    queries.add(x);
                    last = x;
                }
            }
 
            // Process every element using the useful queries.
            for (int i = 0; i < n; i++) {
                for (int x : queries) {
 
                    long power = 1L << x;
 
                    if (a[i] % power == 0) {
                        a[i] += 1L << (x - 1);
                    }
                }
            }
 
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
 
            System.out.println();
        }
    }
}