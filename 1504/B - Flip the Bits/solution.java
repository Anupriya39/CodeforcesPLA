import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
 
            int[] balanced = new int[n];
            int count0 = 0, count1 = 0;
 
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '0') count0++;
                else count1++;
 
                if (count0 == count1) {
                    balanced[i] = 1;
                }
            }
 
            boolean flipped = false;
            boolean possible = true;
 
            for (int i = n - 1; i >= 0; i--) {
                char current = a.charAt(i);
 
                if (flipped) {
                    current = (current == '0') ? '1' : '0';
                }
 
                if (current != b.charAt(i)) {
                    if (balanced[i] == 0) {
                        possible = false;
                        break;
                    }
                    flipped = !flipped;
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
 
        sc.close();
    }
}