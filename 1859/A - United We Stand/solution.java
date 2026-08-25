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
 
            Arrays.sort(a);
 
            int min = a[0];
            int cnt = 0;
 
            while (cnt < n && a[cnt] == min) {
                cnt++;
            }
 
            if (cnt == n) {
                System.out.println(-1);
                continue;
            }
 
            System.out.println(cnt + " " + (n - cnt));
 
            // Array b
            for (int i = 0; i < cnt; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
 
            // Array c
            for (int i = cnt; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
 
        sc.close();
    }
}