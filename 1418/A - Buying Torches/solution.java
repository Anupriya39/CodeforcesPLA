import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
 
            // Total sticks needed:
            // n sticks for torches + n*y sticks to buy n coal
            long required = n * (y + 1);
 
            // Number of stick trades
            long stickTrades = (required - 1 + (x - 2)) / (x - 1);
 
            // n trades to buy n coal
            long answer = stickTrades + n;
 
            out.append(answer).append('
');
        }
 
        System.out.print(out);
    }
}