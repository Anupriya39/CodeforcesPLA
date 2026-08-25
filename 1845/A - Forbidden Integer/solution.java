import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
 
            // If 1 is available, use n copies of 1
            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
 
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
 
            // 1 is forbidden
            else {
                // Only 1 is available, but it is forbidden
                if (k == 1) {
                    System.out.println("NO");
                }
 
                // We can use 2
                else if (k == 2) {
                    if (n % 2 == 0) {
                        System.out.println("YES");
                        System.out.println(n / 2);
 
                        for (int i = 0; i < n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("NO");
                    }
                }
 
                // k >= 3, so we have 2 and 3
                else {
                    if (n % 2 == 0) {
                        System.out.println("YES");
                        System.out.println(n / 2);
 
                        for (int i = 0; i < n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("YES");
 
                        // One 3 + remaining 2s
                        int count2 = (n - 3) / 2;
 
                        System.out.println(count2 + 1);
 
                        System.out.print(3 + " ");
 
                        for (int i = 0; i < count2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
 
        sc.close();
    }
}