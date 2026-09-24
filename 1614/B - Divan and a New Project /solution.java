import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[][] a = new int[n][2];
 
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = i + 1;
            }
 
            Arrays.sort(a, (x, y) -> Integer.compare(y[0], x[0]));
 
            int[] pos = new int[n + 1];
            pos[0] = 0;
 
            long total = 0;
 
            for (int i = 0; i < n; i++) {
                int distance = (i / 2) + 1;
 
                int coordinate;
                if (i % 2 == 0) {
                    coordinate = distance;
                } else {
                    coordinate = -distance;
                }
 
                int id = a[i][1];
                pos[id] = coordinate;
 
                total += 2L * a[i][0] * distance;
            }
 
            System.out.println(total);
 
            for (int i = 0; i <= n; i++) {
                System.out.print(pos[i] + " ");
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}