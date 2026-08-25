import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int xor = 0;
 
            for (int i = 0; i < n; i++) {
                xor ^= sc.nextInt();
            }
 
            if (n % 2 == 1) {
                // Odd number of elements
                System.out.println(xor);
            } else {
                // Even number of elements
                if (xor == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(-1);
                }
            }
        }
 
        sc.close();
    }
}