import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            int rounds = 0;
 
            while (true) {
 
                // Stop if any two are equal
                if (a == b || b == c || a == c) {
                    break;
                }
 
                // Find maximum and minimum
                int max = Math.max(a, Math.max(b, c));
                int min = Math.min(a, Math.min(b, c));
 
                // Maximum player gives one token
                if (a == max) {
                    a--;
                } else if (b == max) {
                    b--;
                } else {
                    c--;
                }
 
                // Minimum player receives one token
                if (a == min) {
                    a++;
                } else if (b == min) {
                    b++;
                } else {
                    c++;
                }
 
                rounds++;
            }
 
            System.out.println(rounds);
        }
 
        sc.close();
    }
}