import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
 
            long x = a;
            long y = b;
 
            int powerA = 0;
            int powerB = 0;
 
            // Remove all factors of 2 from a
            while (x % 2 == 0) {
                x /= 2;
                powerA++;
            }
 
            // Remove all factors of 2 from b
            while (y % 2 == 0) {
                y /= 2;
                powerB++;
            }
 
            // Odd parts must be equal
            if (x != y) {
                out.append(-1).append('
');
            } else {
                int diff = Math.abs(powerA - powerB);
 
                // Each operation can change the power by at most 3
                int answer = (diff + 2) / 3;
 
                out.append(answer).append('
');
            }
        }
 
        System.out.print(out);
    }
}