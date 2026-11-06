import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();
 
        long[] a = new long[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
 
        Arrays.sort(a);
 
        ArrayList<Long> gaps = new ArrayList<>();
 
        for (int i = 1; i < n; i++) {
            long diff = a[i] - a[i - 1];
 
            if (diff > x) {
                long needed = (diff - 1) / x;
                gaps.add(needed);
            }
        }
 
        Collections.sort(gaps);
 
        int groups = gaps.size() + 1;
 
        for (long needed : gaps) {
            if (k >= needed) {
                k -= needed;
                groups--;
            } else {
                break;
            }
        }
 
        System.out.println(groups);
        sc.close();
    }
}