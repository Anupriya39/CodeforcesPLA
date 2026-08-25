import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int count2 = 0;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 2) {
                    count2++;
                }
            }
 
            // Odd number of 2s -> impossible
            if (count2 % 2 != 0) {
                System.out.println(-1);
                continue;
            }
 
            int need = count2 / 2;
            int seen2 = 0;
            int answer = -1;
 
            for (int i = 0; i < n; i++) {
                if (a[i] == 2) {
                    seen2++;
 
                    if (seen2 == need) {
                        answer = i + 1; // k is 1-indexed
                        break;
                    }
                }
            }
 
            // If there are no 2s, every product is 1.
            // Smallest k is 1.
            if (count2 == 0) {
                answer = 1;
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}