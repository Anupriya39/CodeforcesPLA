import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
 
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long q = sc.nextLong();
 
            long ans = 0;
            long good = 0;
 
            for (int i = 0; i < n; i++) {
                long temp = sc.nextLong();
 
                if (temp <= q) {
                    good++;
                } else {
                    if (good >= k) {
                        long x = good - k + 1;
                        ans += x * (x + 1) / 2;
                    }
 
                    good = 0;
                }
            }
 
            // Process the final good block
            if (good >= k) {
                long x = good - k + 1;
                ans += x * (x + 1) / 2;
            }
 
            out.append(ans).append('
');
        }
 
        System.out.print(out);
    }
 
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
 
        FastScanner(InputStream in) {
            this.in = in;
        }
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
 
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        long nextLong() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            long sign = 1;
 
            if (c == '-') {
                sign = -1;
                c = read();
            }
 
            long res = 0;
 
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
 
            return res * sign;
        }
 
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}