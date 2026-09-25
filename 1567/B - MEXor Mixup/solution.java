import java.util.*;
 
public class Main {
    
    static int xorTill(int n) {
        // XOR of 0...n
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            // XOR of 0,1,...,a-1
            int currentXor = xorTill(a - 1);
 
            int need = currentXor ^ b;
 
            if (need == 0) {
                System.out.println(a);
            } else if (need != a) {
                System.out.println(a + 1);
            } else {
                System.out.println(a + 2);
            }
        }
 
        sc.close();
    }
}