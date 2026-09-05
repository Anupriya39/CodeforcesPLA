import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int odd = 0;
            int mod4zero = 0;
            int mod4two = 0;
 
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
 
                if (x % 2 == 1) {
                    odd++;
                } else if (x % 4 == 0) {
                    mod4zero++;
                } else {
                    mod4two++;
                }
            }
 
            System.out.println(Math.max(odd,
                    Math.max(mod4zero, mod4two)));
        }
 
        sc.close();
    }
}