import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
 
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
 
            int l = 0;
            while (l < n && p[l] == l + 1) l++;
 
            int r = n - 1;
            while (r >= 0 && p[r] == r + 1) r--;
 
            if (l == n) {
                System.out.println("YES");
                continue;
            }
 
            // Reverse the selected indices l...r.
            // Since indices need not be consecutive, we can select
            // exactly the positions whose values are misplaced.
            ArrayList<Integer> pos = new ArrayList<>();
 
            for (int i = l; i <= r; i++) {
                if (p[i] != i + 1) {
                    pos.add(i);
                }
            }
 
            int[] q = p.clone();
 
            for (int i = 0; i < pos.size(); i++) {
                q[pos.get(i)] = p[pos.get(pos.size() - 1 - i)];
            }
 
            boolean ok = true;
 
            for (int i = 0; i < n; i++) {
                if (q[i] != i + 1) {
                    ok = false;
                    break;
                }
            }
 
            System.out.println(ok ? "YES" : "NO");
        }
 
        sc.close();
    }
}