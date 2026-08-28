import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            Arrays.sort(a);
 
            int maxLength = 1;
            int currentLength = 1;
 
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    currentLength++;
                } else {
                    currentLength = 1;
                }
 
                maxLength = Math.max(maxLength, currentLength);
            }
 
            System.out.println(n - maxLength);
        }
 
        sc.close();
    }
}