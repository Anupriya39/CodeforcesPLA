import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine());
 
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            int[] p = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
 
            boolean found = false;
 
            for (int j = 1; j < n - 1 && !found; j++) {
 
                // Find i < j with p[i] < p[j]
                int left = -1;
                for (int i = 0; i < j; i++) {
                    if (p[i] < p[j]) {
                        left = i;
                        break;
                    }
                }
 
                if (left == -1) continue;
 
                // Find k > j with p[k] < p[j]
                int right = -1;
                for (int k = j + 1; k < n; k++) {
                    if (p[k] < p[j]) {
                        right = k;
                        break;
                    }
                }
 
                if (right != -1) {
                    System.out.println("YES");
                    System.out.println((left + 1) + " " + (j + 1) + " " + (right + 1));
                    found = true;
                }
            }
 
            if (!found) {
                System.out.println("NO");
            }
        }
    }
}