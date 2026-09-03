import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
 
            // Odd number of wheels is impossible
            if (n % 2 != 0) {
                System.out.println(-1);
                continue;
            }
 
            long minBuses = (n + 5) / 6; // ceil(n / 6)
            long maxBuses = n / 4;
 
            // Check if a valid combination exists
            if (minBuses > maxBuses) {
                System.out.println(-1);
            } else {
                System.out.println(minBuses + " " + maxBuses);
            }
        }
 
        sc.close();
    }
}