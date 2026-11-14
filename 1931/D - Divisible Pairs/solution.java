import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
 
            HashMap<Long, Long> freq = new HashMap<>();
            long ans = 0;
 
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
 
                long modX = a % x;
                long modY = a % y;
 
                long requiredX = (x - modX) % x;
 
                long key = requiredX * y + modY;
 
                ans += freq.getOrDefault(key, 0L);
 
                long currentKey = modX * y + modY;
                freq.put(currentKey, freq.getOrDefault(currentKey, 0L) + 1);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}