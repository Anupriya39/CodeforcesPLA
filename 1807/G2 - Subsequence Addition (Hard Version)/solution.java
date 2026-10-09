import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
 
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            Arrays.sort(a);
 
            if (a[0] != 1) {
                System.out.println("NO");
                continue;
            }
 
            long sum = a[0];
            boolean possible = true;
 
            for (int i = 1; i < n; i++) {
                if (a[i] > sum) {
                    possible = false;
                    break;
                }
 
                sum += a[i];
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
    }
}