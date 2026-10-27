import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
 
            int[] a = new int[n];
            long[] prefixSum = new long[n];
            int[] prefixMax = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
 
                prefixSum[i] = a[i];
                prefixMax[i] = a[i];
 
                if (i > 0) {
                    prefixSum[i] += prefixSum[i - 1];
                    prefixMax[i] = Math.max(prefixMax[i], prefixMax[i - 1]);
                }
            }
 
            for (int i = 0; i < q; i++) {
                int k = sc.nextInt();
 
                int left = 0, right = n - 1;
                int answerIndex = -1;
 
                while (left <= right) {
                    int mid = left + (right - left) / 2;
 
                    if (prefixMax[mid] <= k) {
                        answerIndex = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
 
                long answer = (answerIndex == -1) ? 0 : prefixSum[answerIndex];
 
                System.out.print(answer + " ");
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}