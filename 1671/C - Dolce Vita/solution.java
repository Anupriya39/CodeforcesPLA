import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
 
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            Arrays.sort(a);
 
            long sum = 0;
            long answer = 0;
 
            for (int i = 0; i < n; i++) {
                sum += a[i];
 
                if (sum > x) {
                    break;
                }
 
                long days = (x - sum) / (i + 1) + 1;
                answer += days;
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}