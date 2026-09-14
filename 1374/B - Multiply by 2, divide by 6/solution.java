import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
 
            int count2 = 0;
            int count3 = 0;
 
            while (n % 2 == 0) {
                n /= 2;
                count2++;
            }
 
            while (n % 3 == 0) {
                n /= 3;
                count3++;
            }
 
            // Other prime factors exist
            if (n != 1 || count2 > count3) {
                System.out.println(-1);
            } else {
                System.out.println(2 * count3 - count2);
            }
        }
 
        sc.close();
    }
}