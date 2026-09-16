import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
 
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            long sumSecond = 0;
            long globalMin = Long.MAX_VALUE;
            long minSecond = Long.MAX_VALUE;
 
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
 
                long min1 = Long.MAX_VALUE;
                long min2 = Long.MAX_VALUE;
 
                for (int j = 0; j < m; j++) {
                    long x = sc.nextLong();
 
                    if (x < min1) {
                        min2 = min1;
                        min1 = x;
                    } else if (x < min2) {
                        min2 = x;
                    }
                }
 
                globalMin = Math.min(globalMin, min1);
                minSecond = Math.min(minSecond, min2);
                sumSecond += min2;
            }
 
            long answer = sumSecond - minSecond + globalMin;
 
            out.append(answer).append('
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