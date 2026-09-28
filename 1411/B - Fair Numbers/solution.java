import java.io.*;
import java.util.*;
 
public class Main {
 
    static boolean isFair(long n) {
        long temp = n;
 
        while (temp > 0) {
            long digit = temp % 10;
 
            if (digit != 0 && n % digit != 0) {
                return false;
            }
 
            temp /= 10;
        }
 
        return true;
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
 
            while (!isFair(n)) {
                n++;
            }
 
            out.append(n).append('
');
        }
 
        System.out.print(out);
    }
}