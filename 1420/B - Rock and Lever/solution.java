import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] freq = new int[32];
            long ans = 0;
 
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
 
                int bit = 31 - Integer.numberOfLeadingZeros(a);
 
                ans += freq[bit];
                freq[bit]++;
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}