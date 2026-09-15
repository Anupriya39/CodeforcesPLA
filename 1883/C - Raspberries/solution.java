import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int answer = Integer.MAX_VALUE;
            int evenCount = 0;
            int minEvenCost = Integer.MAX_VALUE;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
 
                // Already divisible by k
                if (x % k == 0) {
                    answer = 0;
                }
 
                // Minimum operations to make x divisible by k
                int cost = (k - x % k) % k;
                answer = Math.min(answer, cost);
 
                // Special handling for k = 4
                if (k == 4) {
                    if (x % 2 == 0) {
                        evenCount++;
                        minEvenCost = Math.min(minEvenCost, 2 - (x % 2));
                    }
                }
            }
 
            if (k == 4) {
                // One number can be made divisible by 4
                int option1 = answer;
 
                // Or make two numbers even
                int option2 = Integer.MAX_VALUE;
 
                if (evenCount >= 2) {
                    option2 = 0;
                } else if (evenCount == 1) {
                    option2 = 1;
                } else {
                    option2 = 2;
                }
 
                answer = Math.min(option1, option2);
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}