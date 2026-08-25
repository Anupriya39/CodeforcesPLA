import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
 
            // Cannot decrease y
            if (d < b) {
                System.out.println(-1);
                continue;
            }
 
            long diagonal = d - b;
 
            // x after all diagonal moves
            long xAfterDiagonal = a + diagonal;
 
            // Cannot increase x using left moves
            if (xAfterDiagonal < c) {
                System.out.println(-1);
                continue;
            }
 
            long leftMoves = xAfterDiagonal - c;
 
            long answer = diagonal + leftMoves;
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}