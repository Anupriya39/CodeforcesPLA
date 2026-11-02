import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
 
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            if (a[n - 2] > a[n - 1]) {
                out.append("-1
");
                continue;
            }
 
            if (a[n - 1] < 0) {
                boolean sorted = true;
                for (int i = 1; i < n; i++) {
                    if (a[i] < a[i - 1]) {
                        sorted = false;
                        break;
                    }
                }
 
                out.append(sorted ? "0
" : "-1
");
                continue;
            }
 
            out.append(n - 2).append('
');
 
            for (int i = 0; i < n - 2; i++) {
                out.append(i + 1).append(" ")
                   .append(n - 1).append(" ")
                   .append(n).append('
');
            }
        }
 
        System.out.print(out);
    }
}