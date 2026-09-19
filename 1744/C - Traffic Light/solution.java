import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
 
            if (c == 'g') {
                System.out.println(0);
                continue;
            }
 
            // Duplicate the string to handle circular movement
            s = s + s;
 
            int nextGreen = -1;
            int ans = 0;
 
            // Scan from right to left
            for (int i = 2 * n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'g') {
                    nextGreen = i;
                }
 
                if (i < n && s.charAt(i) == c) {
                    ans = Math.max(ans, nextGreen - i);
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}