import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            TreeMap<Integer, Integer> freq = new TreeMap<>();
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }
 
            int ans = 0;
 
            for (int x : freq.keySet()) {
                int count = freq.get(x);
                int prev = freq.getOrDefault(x - 1, 0);
 
                ans += Math.max(0, count - prev);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}