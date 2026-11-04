import java.io.*;
 
public class Main {
 
    static int solve(String s, char ch) {
        int left = 0;
        int right = s.length() - 1;
        int removed = 0;
 
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if (s.charAt(left) == ch) {
                left++;
                removed++;
            } else if (s.charAt(right) == ch) {
                right--;
                removed++;
            } else {
                return Integer.MAX_VALUE;
            }
        }
 
        return removed;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
 
            int answer = Integer.MAX_VALUE;
 
            for (char ch = 'a'; ch <= 'z'; ch++) {
                answer = Math.min(answer, solve(s, ch));
            }
 
            out.append(answer == Integer.MAX_VALUE ? -1 : answer).append('
');
        }
 
        System.out.print(out);
    }
}