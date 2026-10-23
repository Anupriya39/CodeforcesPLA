import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
 
            long lcm = (x / gcd(x, y)) * y;
 
            long plus = n / x - n / lcm;
            long minus = n / y - n / lcm;
 
            long sumLargest = (n * (n + 1) / 2)
                    - ((n - plus) * (n - plus + 1) / 2);
 
            long sumSmallest = minus * (minus + 1) / 2;
 
            System.out.println(sumLargest - sumSmallest);
        }
 
        sc.close();
    }
 
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}