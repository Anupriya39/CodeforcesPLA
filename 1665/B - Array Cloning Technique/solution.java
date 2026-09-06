import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            int n = fs.nextInt();
 
            HashMap<Long, Integer> freq = new HashMap<>();
            int maxFreq = 0;
 
            for (int i = 0; i < n; i++) {
                long x = fs.nextLong();
                int count = freq.getOrDefault(x, 0) + 1;
                freq.put(x, count);
                maxFreq = Math.max(maxFreq, count);
            }
 
            int cur = maxFreq;
            int answer = 0;
 
            while (cur < n) {
                // Clone operation
                answer++;
 
                // One copy can provide at most cur useful elements
                int add = Math.min(cur, n - cur);
 
                // Swaps needed to bring these elements
                answer += add;
 
                cur += add;
            }
 
            out.append(answer).append('
');
        }
 
        System.out.print(out);
    }
 
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
 
        FastScanner(InputStream in) {
            this.in = in;
        }
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len == -1) return -1;
            }
            return buffer[ptr++];
        }
 
        long nextLong() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            long res = 0;
            boolean negative = false;
 
            if (c == '-') {
                negative = true;
                c = read();
            }
 
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
 
            return negative ? -res : res;
        }
 
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}