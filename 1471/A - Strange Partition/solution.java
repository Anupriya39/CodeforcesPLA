import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
 
            long sum = 0;
            long maxBeauty = 0;
 
            st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(st.nextToken());
 
                sum += a;
                maxBeauty += (a + x - 1) / x;
            }
 
            long minBeauty = (sum + x - 1) / x;
 
            System.out.println(minBeauty + " " + maxBeauty);
        }
    }
}