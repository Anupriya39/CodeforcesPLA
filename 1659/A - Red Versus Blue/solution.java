import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
 
            StringBuilder ans = new StringBuilder();
 
            int groups = b + 1;
            int base = r / groups;
            int extra = r % groups;
 
            for (int i = 0; i < groups; i++) {
                int reds = base;
 
                if (extra > 0) {
                    reds++;
                    extra--;
                }
 
                for (int j = 0; j < reds; j++) {
                    ans.append('R');
                }
 
                if (i < b) {
                    ans.append('B');
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}