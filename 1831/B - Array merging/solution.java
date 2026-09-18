import java.io.*;
import java.util.*;
 
public class Main {
 
    static int[] getMaxRuns(int[] arr, int maxVal) {
        int[] maxRun = new int[maxVal + 1];
 
        int n = arr.length;
        int i = 0;
 
        while (i < n) {
            int j = i;
 
            while (j < n && arr[j] == arr[i]) {
                j++;
            }
 
            int len = j - i;
            maxRun[arr[i]] = Math.max(maxRun[arr[i]], len);
 
            i = j;
        }
 
        return maxRun;
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
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
 
            int maxVal = 2 * n;
 
            int[] runA = getMaxRuns(a, maxVal);
            int[] runB = getMaxRuns(b, maxVal);
 
            int ans = 0;
 
            for (int x = 1; x <= maxVal; x++) {
                ans = Math.max(ans, runA[x] + runB[x]);
            }
 
            System.out.println(ans);
        }
    }
}