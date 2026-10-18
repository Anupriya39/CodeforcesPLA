import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int left = 0;
            int right = n - 1;
            int leftSum = 0;
            int rightSum = 0;
            int answer = 0;
 
            while (left <= right) {
                if (leftSum <= rightSum) {
                    leftSum += a[left];
                    left++;
                } else {
                    rightSum += a[right];
                    right--;
                }
 
                if (leftSum == rightSum) {
                    answer = left + (n - 1 - right);
                }
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}