import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] last = new int[k + 1];
            int[] max1 = new int[k + 1];
            int[] max2 = new int[k + 1];
 
            for (int i = 1; i <= n; i++) {
                int color = sc.nextInt();
 
                int gap = i - last[color] - 1;
 
                if (gap > max1[color]) {
                    max2[color] = max1[color];
                    max1[color] = gap;
                } else if (gap > max2[color]) {
                    max2[color] = gap;
                }
 
                last[color] = i;
            }
 
            int ans = Integer.MAX_VALUE;
 
            for (int color = 1; color <= k; color++) {
                int gap = n - last[color];
 
                if (gap > max1[color]) {
                    max2[color] = max1[color];
                    max1[color] = gap;
                } else if (gap > max2[color]) {
                    max2[color] = gap;
                }
 
                int current = Math.max(max1[color] / 2, max2[color]);
                ans = Math.min(ans, current);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}