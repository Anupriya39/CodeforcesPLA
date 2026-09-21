import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] s = new int[n];
            int[] p = new int[n];
 
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }
 
            boolean possible = true;
            int start = 0;
 
            while (start < n) {
                int end = start;
 
                while (end < n && s[end] == s[start]) {
                    end++;
                }
 
                // A group of size 1 cannot be shuffled
                if (end - start == 1) {
                    possible = false;
                    break;
                }
 
                // Rotate indices within this equal-size group
                for (int i = start; i < end - 1; i++) {
                    p[i] = i + 2;
                }
                p[end - 1] = start + 1;
 
                start = end;
            }
 
            if (!possible) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(p[i] + (i == n - 1 ? "
" : " "));
                }
            }
        }
 
        sc.close();
    }
}