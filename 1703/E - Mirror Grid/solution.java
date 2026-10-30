import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
 
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    grid[i][j] = s.charAt(j) - '0';
                }
            }
 
            int ans = 0;
 
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n + 1) / 2; j++) {
 
                    int a = grid[i][j];
                    int b = grid[j][n - 1 - i];
                    int c = grid[n - 1 - i][n - 1 - j];
                    int d = grid[n - 1 - j][i];
 
                    int ones = a + b + c + d;
                    ans += Math.min(ones, 4 - ones);
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}