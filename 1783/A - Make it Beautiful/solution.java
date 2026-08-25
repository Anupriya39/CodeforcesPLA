import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            // If all elements are equal, impossible
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allSame = false;
                    break;
                }
            }
 
            if (allSame) {
                System.out.println("NO");
                continue;
            }
 
            // Put the largest element first
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[maxIndex]) {
                    maxIndex = i;
                }
            }
 
            int temp = a[0];
            a[0] = a[maxIndex];
            a[maxIndex] = temp;
 
            System.out.println("YES");
 
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
 
        sc.close();
    }
}