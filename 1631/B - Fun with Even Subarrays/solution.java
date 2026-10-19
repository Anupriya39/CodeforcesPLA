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
 
            int target = a[n - 1];
            int i = n - 1;
            int operations = 0;
 
            while (i >= 0) {
                while (i >= 0 && a[i] == target) {
                    i--;
                }
 
                if (i < 0) {
                    break;
                }
 
                operations++;
                i -= (n - 1 - i);
            }
 
            System.out.println(operations);
        }
 
        sc.close();
    }
}