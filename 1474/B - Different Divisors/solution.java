import java.util.*;
 
public class Main {
 
    static boolean isPrime(long x) {
        if (x < 2) return false;
 
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
 
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long d = sc.nextLong();
 
            // Find first prime >= d + 1
            long p = d + 1;
            while (!isPrime(p)) {
                p++;
            }
 
            // Find first prime >= p + d
            long q = p + d;
            while (!isPrime(q)) {
                q++;
            }
 
            System.out.println(p * q);
        }
 
        sc.close();
    }
}