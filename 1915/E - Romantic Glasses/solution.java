import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            long sum = 0;
            HashSet<Long> seen = new HashSet<>();
            seen.add(0L);
 
            boolean possible = false;
 
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
 
                if (i % 2 == 0) {
                    sum += a;
                } else {
                    sum -= a;
                }
 
                if (seen.contains(sum)) {
                    possible = true;
                }
 
                seen.add(sum);
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
 
        sc.close();
    }
}