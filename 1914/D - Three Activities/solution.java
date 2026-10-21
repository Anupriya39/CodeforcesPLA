import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
 
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
 
            readArray(br, a);
            readArray(br, b);
            readArray(br, c);
 
            Integer[] ia = new Integer[n];
            Integer[] ib = new Integer[n];
            Integer[] ic = new Integer[n];
 
            for (int i = 0; i < n; i++) {
                ia[i] = ib[i] = ic[i] = i;
            }
 
            Arrays.sort(ia, (x, y) -> Integer.compare(a[y], a[x]));
            Arrays.sort(ib, (x, y) -> Integer.compare(b[y], b[x]));
            Arrays.sort(ic, (x, y) -> Integer.compare(c[y], c[x]));
 
            long ans = 0;
 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        int x = ia[i];
                        int y = ib[j];
                        int z = ic[k];
 
                        if (x != y && x != z && y != z) {
                            long sum = (long) a[x] + b[y] + c[z];
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }
 
            out.append(ans).append('
');
        }
 
        System.out.print(out);
    }
 
    static void readArray(BufferedReader br, int[] arr) throws IOException {
        int idx = 0;
 
        while (idx < arr.length) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            while (st.hasMoreTokens() && idx < arr.length) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }
    }
}