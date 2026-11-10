import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
 
            long ans;
 
            if (n % 2 == 0) {
                ans = k % n;
            } else {
                ans = (k + (k - 1) / (n / 2)) % n;
            }
 
            if (ans == 0) {
                ans = n;
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}