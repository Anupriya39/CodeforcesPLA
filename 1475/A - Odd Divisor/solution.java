import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
 
            while (n % 2 == 0) {
                n /= 2;
            }
 
            System.out.println(n > 1 ? "YES" : "NO");
        }
    }
}