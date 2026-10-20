import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int q = sc.nextInt();
 
        int[] first = new int[51];
 
        for (int i = 1; i <= n; i++) {
            int color = sc.nextInt();
 
            if (first[color] == 0) {
                first[color] = i;
            }
        }
 
        int top = 0;
 
        for (int i = 0; i < q; i++) {
            int color = sc.nextInt();
 
            System.out.print(first[color] + " ");
 
            if (first[color] != 1) {
                int oldPosition = first[color];
 
                for (int c = 1; c <= 50; c++) {
                    if (first[c] > 0 && first[c] < oldPosition) {
                        first[c]++;
                    }
                }
 
                first[color] = 1;
            }
        }
 
        sc.close();
    }
}