import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            long[] a = new long[n];
            HashSet<Long> set = new HashSet<>();
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                set.add(a[i]);
            }
 
            boolean possible = false;
 
            for (int i = 0; i < n; i++) {
                if (set.contains(a[i] - k) || set.contains(a[i] + k)) {
                    possible = true;
                    break;
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
 
        sc.close();
    }
}