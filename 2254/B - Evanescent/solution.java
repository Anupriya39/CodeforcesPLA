import java.util.*;
 
public class Main {
 
    static int compressedLength(String s) {
        int count = 1;
 
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;
            }
        }
 
        return count;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int original = compressedLength(s);
            int answer = original;
 
            for (int i = 1; i < n - 1; i++) {
 
                int cur = original;
 
                // Remove boundary: s[i-1] -> s[i]
                if (s.charAt(i - 1) != s.charAt(i)) {
                    cur--;
                }
 
                // Remove boundary: s[i] -> s[i+1]
                if (s.charAt(i) != s.charAt(i + 1)) {
                    cur--;
                }
 
                // Add new boundary: s[i-1] -> s[i+1]
                if (s.charAt(i - 1) != s.charAt(i + 1)) {
                    cur++;
                }
 
                answer = Math.min(answer, cur);
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}