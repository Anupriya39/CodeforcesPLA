import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int dots = 0;
            int maxSegment = 0;
            int current = 0;
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    dots++;
                    current++;
                    maxSegment = Math.max(maxSegment, current);
                } else {
                    current = 0;
                }
            }
 
            if (maxSegment >= 3)
                System.out.println(2);
            else
                System.out.println(dots);
        }
 
        sc.close();
    }
}