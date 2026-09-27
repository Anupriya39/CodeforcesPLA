import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            long sum = 0;
            int minAbs = Integer.MAX_VALUE;
            int negativeCount = 0;
            boolean hasZero = false;
 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
 
                    if (x < 0) {
                        negativeCount++;
                    }
 
                    if (x == 0) {
                        hasZero = true;
                    }
 
                    int abs = Math.abs(x);
                    sum += abs;
                    minAbs = Math.min(minAbs, abs);
                }
            }
 
            if (negativeCount % 2 == 1 && !hasZero) {
                sum -= 2L * minAbs;
            }
 
            System.out.println(sum);
        }
 
        sc.close();
    }
}