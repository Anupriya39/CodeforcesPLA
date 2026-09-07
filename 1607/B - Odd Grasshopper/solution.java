import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            long x = fs.nextLong();
            long n = fs.nextLong();
 
            long ans = x;
            int rem = (int) (n % 4);
 
            if (x % 2 == 0) {
                if (rem == 1) {
                    ans = x - n;
                } else if (rem == 2) {
                    ans = x + 1;
                } else if (rem == 3) {
                    ans = x + n + 1;
                }
            } else {
                if (rem == 1) {
                    ans = x + n;
                } else if (rem == 2) {
                    ans = x - 1;
                } else if (rem == 3) {
                    ans = x - n - 1;
                }
            }
 
            out.append(ans).append('
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