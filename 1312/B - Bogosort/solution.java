import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            int[] a = new int[n];
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
 
            // Sort in descending order
            Arrays.sort(a);
 
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
 
            System.out.println();
        }
    }
}