import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        long d = sc.nextLong();
 
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
 
        Arrays.sort(p);
 
        int left = 0;
        int right = n - 1;
        int wins = 0;
 
        while (left <= right) {
            long strongest = p[right];
 
            // Minimum team size needed to beat D
            long needed = d / strongest + 1;
 
            if (right - left + 1 >= needed) {
                // Use the strongest player and needed - 1 others
                left += (int) needed - 1;
                wins++;
            }
 
            right--;
        }
 
        System.out.println(wins);
        sc.close();
    }
}