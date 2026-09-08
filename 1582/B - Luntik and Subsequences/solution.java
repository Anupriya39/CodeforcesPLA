import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int ones = 0;
            int zeros = 0;
 
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());
 
                if (x == 1) {
                    ones++;
                } else if (x == 0) {
                    zeros++;
                }
            }
 
            long ans = ones * (1L << zeros);
 
            System.out.println(ans);
        }
    }
}