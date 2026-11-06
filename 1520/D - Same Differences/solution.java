import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            HashMap<Long, Long> freq = new HashMap<>();
            long ans = 0;
 
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long key = a - i;
 
                ans += freq.getOrDefault(key, 0L);
                freq.put(key, freq.getOrDefault(key, 0L) + 1);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}