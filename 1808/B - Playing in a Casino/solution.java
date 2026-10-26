import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int[][] a = new int[n][m];
 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
 
            long answer = 0;
 
            for (int j = 0; j < m; j++) {
                int[] col = new int[n];
 
                for (int i = 0; i < n; i++) {
                    col[i] = a[i][j];
                }
 
                Arrays.sort(col);
 
                long prefixSum = 0;
 
                for (int i = 0; i < n; i++) {
                    answer += (long) col[i] * i - prefixSum;
                    prefixSum += col[i];
                }
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}