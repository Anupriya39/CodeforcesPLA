import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            long a = fs.nextLong();
            long b = fs.nextLong();
            long c = fs.nextLong();
 
            boolean possible = false;
 
            // Multiply a
            long x = 2 * b - c;
            if (x > 0 && x % a == 0) {
                possible = true;
            }
 
            // Multiply b
            long y = a + c;
            if (y > 0 && y % (2 * b) == 0) {
                possible = true;
            }
 
            // Multiply c
            long z = 2 * b - a;
            if (z > 0 && z % c == 0) {
                possible = true;
            }
 
            out.append(possible ? "YES
" : "NO
");
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
            int ch;
            do {
                ch = read();
            } while (ch <= ' ');
 
            long res = 0;
 
            while (ch > ' ') {
                res = res * 10 + (ch - '0');
                ch = read();
            }
 
            return res;
        }
 
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}