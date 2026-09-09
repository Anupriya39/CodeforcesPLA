import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int ans = Integer.MAX_VALUE;
 
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                ans &= x;
            }
 
            System.out.println(ans);
        }
    }
}