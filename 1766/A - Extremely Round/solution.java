import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Generate all extremely round numbers
        ArrayList<Integer> nums = new ArrayList<>();
 
        for (int digit = 1; digit <= 9; digit++) {
            int value = digit;
 
            while (value <= 999999) {
                nums.add(value);
                value *= 10;
            }
        }
 
        // Sort the numbers
        Collections.sort(nums);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int count = 0;
 
            for (int x : nums) {
                if (x <= n) {
                    count++;
                } else {
                    break;
                }
            }
 
            System.out.println(count);
        }
 
        sc.close();
    }
}