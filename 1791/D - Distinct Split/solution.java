import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
 
            int[] prefix = new int[n];
            int[] suffix = new int[n];
 
            // Calculate prefix distinct counts
            boolean[] seen = new boolean[26];
            int count = 0;
 
            for (int i = 0; i < n; i++) {
                int c = s.charAt(i) - 'a';
 
                if (!seen[c]) {
                    seen[c] = true;
                    count++;
                }
 
                prefix[i] = count;
            }
 
            // Calculate suffix distinct counts
            Arrays.fill(seen, false);
            count = 0;
 
            for (int i = n - 1; i >= 0; i--) {
                int c = s.charAt(i) - 'a';
 
                if (!seen[c]) {
                    seen[c] = true;
                    count++;
                }
 
                suffix[i] = count;
            }
 
            // Try every valid split
            int ans = 0;
 
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, prefix[i] + suffix[i + 1]);
            }
 
            System.out.println(ans);
        }
    }
}