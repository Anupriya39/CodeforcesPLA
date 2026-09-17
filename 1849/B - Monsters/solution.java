import java.io.*;
import java.util.*;
 
public class Main {
 
    static class Monster {
        long health;
        int index;
 
        Monster(long health, int index) {
            this.health = health;
            this.index = index;
        }
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
 
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            Monster[] monsters = new Monster[n];
 
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
 
                long rem = a % k;
 
                if (rem == 0) {
                    rem = k;
                }
 
                monsters[i] = new Monster(rem, i + 1);
            }
 
            Arrays.sort(monsters, (x, y) -> {
                if (x.health != y.health) {
                    return Long.compare(y.health, x.health);
                }
                return Integer.compare(x.index, y.index);
            });
 
            for (int i = 0; i < n; i++) {
                if (i > 0) out.append(" ");
                out.append(monsters[i].index);
            }
 
            out.append('
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
 
            long result = 0;
 
            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }
 
            return result;
        }
 
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}