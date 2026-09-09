import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
 
            if (a == b) {
                System.out.println("0 0");
                continue;
            }
 
            long d = Math.abs(a - b);
            long smaller = Math.min(a, b);
 
            long r = smaller % d;
 
            long moves = Math.min(r, d - r);
 
            System.out.println(d + " " + moves);
        }
    }
}