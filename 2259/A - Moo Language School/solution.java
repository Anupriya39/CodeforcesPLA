import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
 
            String s = br.readLine().trim();
 
            int answer = 0;
 
            for (int i = 0; i < n; i += k) {
                boolean allOnes = true;
 
                for (int j = i; j < i + k; j++) {
                    if (s.charAt(j) == '0') {
                        allOnes = false;
                        break;
                    }
                }
 
                if (allOnes) {
                    answer++;
                }
            }
 
            out.append(answer).append('
');
        }
 
        System.out.print(out);
    }
}