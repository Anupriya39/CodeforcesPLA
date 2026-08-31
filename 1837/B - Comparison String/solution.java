import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            String s = sc.next();
 
            int maxRun = 1;
            int currentRun = 1;
 
            for (int i = 1; i < n; i++) {
 
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentRun++;
                } else {
                    currentRun = 1;
                }
 
                maxRun = Math.max(maxRun, currentRun);
            }
 
            System.out.println(maxRun + 1);
        }
 
        sc.close();
    }
}