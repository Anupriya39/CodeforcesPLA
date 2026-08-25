import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
 
            int[] freq = new int[26];
 
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
 
            int odd = 0;
 
            for (int count : freq) {
                if (count % 2 != 0) {
                    odd++;
                }
            }
 
            if (odd <= k + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}