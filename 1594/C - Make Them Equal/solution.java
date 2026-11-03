import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(parts[0]);
            char c = parts[1].charAt(0);
 
            String s = br.readLine().trim();
 
            boolean allEqual = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != c) {
                    allEqual = false;
                    break;
                }
            }
 
            if (allEqual) {
                out.append("0
");
                continue;
            }
 
            int x = -1;
 
            for (int i = n / 2; i < n; i++) {
                boolean valid = true;
 
                for (int j = i + 1; j <= n; j += i + 1) {
                    if (s.charAt(j - 1) != c) {
                        valid = false;
                        break;
                    }
                }
 
                if (valid) {
                    x = i + 1;
                    break;
                }
            }
 
            if (x != -1) {
                out.append("1
").append(x).append('
');
            } else {
                out.append("2
").append(n - 1).append(" ").append(n).append('
');
            }
        }
 
        System.out.print(out);
    }
}