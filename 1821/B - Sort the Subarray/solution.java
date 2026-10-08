import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
 
            int n = Integer.parseInt(br.readLine().trim());
 
            int[] a = new int[n];
            int[] b = new int[n];
 
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
 
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
 
            // Find first different position
            int l = 0;
            while (l < n && a[l] == b[l]) {
                l++;
            }
 
            // Find last different position
            int r = n - 1;
            while (r >= 0 && a[r] == b[r]) {
                r--;
            }
 
            // Expand to the left
            while (l > 0 && b[l - 1] <= b[l]) {
                l--;
            }
 
            // Expand to the right
            while (r + 1 < n && b[r] <= b[r + 1]) {
                r++;
            }
 
            System.out.println((l + 1) + " " + (r + 1));
        }
    }
}