import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
 
            int[][] a = new int[n][n];
 
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
 
            int diff = 0;
 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int oppositeI = n - 1 - i;
                    int oppositeJ = n - 1 - j;
 
                    // Count each pair only once
                    if (i * n + j < oppositeI * n + oppositeJ
                            && a[i][j] != a[oppositeI][oppositeJ]) {
                        diff++;
                    }
                }
            }
 
            if (diff > k) {
                System.out.println("NO");
            } else if (n % 2 == 1) {
                System.out.println("YES");
            } else if ((k - diff) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}