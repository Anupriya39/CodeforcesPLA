import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int minus = 0;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
 
                if (x == -1) {
                    minus++;
                }
            }
 
            int operations = 0;
 
            // Make sum >= 0
            while (minus > n / 2) {
                minus--;
                operations++;
            }
 
            // Make product = 1
            if (minus % 2 != 0) {
                minus--;
                operations++;
            }
 
            System.out.println(operations);
        }
 
        sc.close();
    }
}