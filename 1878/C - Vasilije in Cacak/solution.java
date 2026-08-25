import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
 
            // Minimum sum: 1 + 2 + ... + k
            long minSum = k * (k + 1) / 2;
 
            // Maximum sum: n + (n-1) + ... + (n-k+1)
            long maxSum = k * (2 * n - k + 1) / 2;
 
            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}