import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
 
        // last[c] = last position where character c occurs
        int[] last = new int[26];
 
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
 
        // Find i < j such that s[j] < s[i]
        for (int i = 0; i < n; i++) {
            int current = s.charAt(i) - 'a';
 
            // Check if any smaller character occurs after i
            for (int c = 0; c < current; c++) {
                if (last[c] > i) {
                    System.out.println("YES");
                    System.out.println((i + 1) + " " + (last[c] + 1));
                    return;
                }
            }
        }
 
        System.out.println("NO");
    }
}