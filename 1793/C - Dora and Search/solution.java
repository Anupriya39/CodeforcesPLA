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
 
            int l = 0, r = n - 1;
            int min = 1, max = n;
 
            while (l < r) {
                if (a[l] != min && a[l] != max &&
                    a[r] != min && a[r] != max) {
                    break;
                }
 
                if (a[l] == min) {
                    l++;
                    min++;
                } else if (a[l] == max) {
                    l++;
                    max--;
                } else if (a[r] == min) {
                    r--;
                    min++;
                } else if (a[r] == max) {
                    r--;
                    max--;
                } else {
                    break;
                }
            }
 
            if (l >= r) {
                System.out.println(-1);
            } else {
                System.out.println((l + 1) + " " + (r + 1));
            }
        }
 
        sc.close();
    }
}