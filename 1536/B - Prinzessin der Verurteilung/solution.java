import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            boolean[] seen = new boolean[26 * 26 * 26];
 
            // Check all substrings of length 1
            boolean[] one = new boolean[26];
            for (int i = 0; i < n; i++) {
                one[s.charAt(i) - 'a'] = true;
            }
 
            // Find the smallest missing single character
            for (int i = 0; i < 26; i++) {
                if (!one[i]) {
                    System.out.println((char) ('a' + i));
                    break;
                }
            }
 
            // If all single characters exist, check length 2
            if (allPresent(one)) {
                boolean[][] two = new boolean[26][26];
 
                for (int i = 0; i < n - 1; i++) {
                    two[s.charAt(i) - 'a'][s.charAt(i + 1) - 'a'] = true;
                }
 
                boolean found = false;
                for (int i = 0; i < 26 && !found; i++) {
                    for (int j = 0; j < 26; j++) {
                        if (!two[i][j]) {
                            System.out.println("" + (char) ('a' + i) + (char) ('a' + j));
                            found = true;
                            break;
                        }
                    }
                }
 
                // If all length-2 strings exist, check length 3
                if (!found) {
                    boolean[][][] three = new boolean[26][26][26];
 
                    for (int i = 0; i < n - 2; i++) {
                        three[s.charAt(i) - 'a']
                             [s.charAt(i + 1) - 'a']
                             [s.charAt(i + 2) - 'a'] = true;
                    }
 
                    outer:
                    for (int i = 0; i < 26; i++) {
                        for (int j = 0; j < 26; j++) {
                            for (int k = 0; k < 26; k++) {
                                if (!three[i][j][k]) {
                                    System.out.println("" + (char) ('a' + i)
                                            + (char) ('a' + j)
                                            + (char) ('a' + k));
                                    break outer;
                                }
                            }
                        }
                    }
                }
            }
        }
 
        sc.close();
    }
 
    static boolean allPresent(boolean[] arr) {
        for (boolean b : arr) {
            if (!b) return false;
        }
        return true;
    }
}