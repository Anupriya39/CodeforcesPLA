import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            String s = br.readLine().trim();
 
            int zeros = 0;
            int ones = 0;
 
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
 
            int moves = Math.min(zeros, ones);
 
            if (moves % 2 == 1) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
    }
}