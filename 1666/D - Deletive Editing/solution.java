import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int T = Integer.parseInt(br.readLine().trim());
 
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();
 
            int[] countS = new int[26];
            int[] countT = new int[26];
 
            // Count characters
            for (char c : s.toCharArray()) {
                countS[c - 'A']++;
            }
 
            for (char c : t.toCharArray()) {
                countT[c - 'A']++;
            }
 
            boolean possible = true;
 
            // t cannot contain more occurrences than s
            for (int i = 0; i < 26; i++) {
                if (countT[i] > countS[i]) {
                    possible = false;
                    break;
                }
            }
 
            if (possible) {
                /*
                 * The characters that remain must be the LAST
                 * countT[c] occurrences of every character c.
                 *
                 * Scan s from right to left and select exactly
                 * countT[c] occurrences of each character.
                 */
                boolean[] keep = new boolean[s.length()];
                int[] need = countT.clone();
 
                for (int i = s.length() - 1; i >= 0; i--) {
                    int c = s.charAt(i) - 'A';
 
                    if (need[c] > 0) {
                        keep[i] = true;
                        need[c]--;
                    }
                }
 
                // Build the resulting string
                StringBuilder remaining = new StringBuilder();
 
                for (int i = 0; i < s.length(); i++) {
                    if (keep[i]) {
                        remaining.append(s.charAt(i));
                    }
                }
 
                if (!remaining.toString().equals(t)) {
                    possible = false;
                }
            }
 
            out.append(possible ? "YES
" : "NO
");
        }
 
        System.out.print(out);
    }
}