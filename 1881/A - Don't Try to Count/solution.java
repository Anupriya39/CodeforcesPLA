import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String x = sc.next();
            String s = sc.next();
 
            int ans = -1;
 
            for (int i = 0; i <= 6; i++) {
                if (x.contains(s)) {
                    ans = i;
                    break;
                }
                x = x + x;
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}