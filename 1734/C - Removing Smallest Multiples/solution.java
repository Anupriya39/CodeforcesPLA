import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder output = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
 
            boolean[] deleted = new boolean[n + 1];
            long cost = 0;
 
            for (int k = 1; k <= n; k++) {
                for (int j = k; j <= n; j += k) {
                    if (s.charAt(j - 1) == '1') {
                        break;
                    }
 
                    if (!deleted[j]) {
                        cost += k;
                        deleted[j] = true;
                    }
                }
            }
 
            output.append(cost).append('
');
        }
 
        System.out.print(output);
    }
}