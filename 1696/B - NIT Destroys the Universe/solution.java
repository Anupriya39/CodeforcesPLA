import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            int n = fs.nextInt();
 
            boolean inside = false;
            int segments = 0;
 
            for (int i = 0; i < n; i++) {
                long x = fs.nextLong();
 
                if (x != 0) {
                    if (!inside) {
                        segments++;
                        inside = true;
                    }
                } else {
                    inside = false;
                }
            }
 
            if (segments == 0) {
                out.append(0).append('
');
            } else if (segments == 1) {
                out.append(1).append('
');
            } else {
                out.append(2).append('
');
            }
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
 
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
 
            return res;
        }
 
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}