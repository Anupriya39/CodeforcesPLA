import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
 
            int[] a = new int[n];
            int total = 0;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                total += a[i];
            }
 
            if (total < s) {
                System.out.println(-1);
                continue;
            }
 
            if (total == s) {
                System.out.println(0);
                continue;
            }
 
            int left = 0;
            int sum = 0;
            int maxLen = 0;
 
            for (int right = 0; right < n; right++) {
                sum += a[right];
 
                while (sum > s) {
                    sum -= a[left];
                    left++;
                }
 
                if (sum == s) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }
 
            System.out.println(maxLen == 0 ? -1 : n - maxLen);
        }
 
        sc.close();
    }
}