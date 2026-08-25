import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int prev = 0;
            int maxGap = 0;
            int lastStation = 0;
 
            for (int i = 0; i < n; i++) {
                int current = sc.nextInt();
 
                maxGap = Math.max(maxGap, current - prev);
 
                prev = current;
                lastStation = current;
            }
 
            maxGap = Math.max(maxGap, 2 * (x - lastStation));
 
            System.out.println(maxGap);
        }
 
        sc.close();
    }
}