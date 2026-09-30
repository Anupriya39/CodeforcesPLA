import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
 
            boolean[] seen = new boolean[26];
            long ans = 0;
            int distinct = 0;
 
            for (int i = 0; i < n; i++) {
                int c = s.charAt(i) - 'a';
 
                if (!seen[c]) {
                    seen[c] = true;
                    distinct++;
                }
 
                ans += distinct;
            }
 
            System.out.println(ans);
        }
    }
}