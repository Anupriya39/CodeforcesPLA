import java.util.*;
 
public class Main {
 
    static boolean isPalindrome(int[] a, int left, int right, int x) {
        while (left < right) {
            if (a[left] == x) {
                left++;
            } else if (a[right] == x) {
                right--;
            } else if (a[left] == a[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int left = 0, right = n - 1;
 
            while (left < right && a[left] == a[right]) {
                left++;
                right--;
            }
 
            if (left >= right ||
                isPalindrome(a, left, right, a[left]) ||
                isPalindrome(a, left, right, a[right])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}