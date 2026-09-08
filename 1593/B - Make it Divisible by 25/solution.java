import java.io.*;
import java.util.*;
 
public class Main {
    
    static int getMoves(String s, char first, char second) {
        int n = s.length();
 
        // Find second digit from the right
        int j = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == second) {
                j = i;
                break;
            }
        }
 
        if (j == -1) return Integer.MAX_VALUE;
 
        // Find first digit before second digit
        int iPos = -1;
        for (int i = j - 1; i >= 0; i--) {
            if (s.charAt(i) == first) {
                iPos = i;
                break;
            }
        }
 
        if (iPos == -1) return Integer.MAX_VALUE;
 
        // Delete digits between first and second,
        // and all digits after second
        return (j - iPos - 1) + (n - j - 1);
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            String s = br.readLine().trim();
 
            int ans = Math.min(
                Math.min(getMoves(s, '0', '0'), getMoves(s, '2', '5')),
                Math.min(getMoves(s, '5', '0'), getMoves(s, '7', '5'))
            );
 
            System.out.println(ans);
        }
    }
}