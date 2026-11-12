import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            // Find a district belonging to a different gang
            int v = -1;
 
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    v = i;
                    break;
                }
            }
 
            if (v == -1) {
                sb.append("NO
");
                continue;
            }
 
            sb.append("YES
");
 
            // Connect district 1 to all districts with different gangs
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    sb.append(1).append(" ").append(i + 1).append("
");
                }
            }
 
            // Connect district v to remaining districts
            for (int i = 1; i < n; i++) {
                if (a[i] == a[0]) {
                    sb.append(v + 1).append(" ").append(i + 1).append("
");
                }
            }
        }
 
        System.out.print(sb);
        sc.close();
    }
}