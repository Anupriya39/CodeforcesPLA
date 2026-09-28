import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
 
            int balance = 0;
            int moves = 0;
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;
                }
 
                if (balance < 0) {
                    moves++;
                    balance = 0;
                }
            }
 
            out.append(moves).append('
');
        }
 
        System.out.print(out);
    }
}