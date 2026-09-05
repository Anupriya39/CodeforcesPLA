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
 
            // Find positions of existing 1s
            ArrayList<Integer> ones = new ArrayList<>();
 
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    ones.add(i);
                }
            }
 
            int bestL = -1;
            int bestR = -1;
            int bestLength = 0;
 
            // Case 1: There are existing 1s
            if (!ones.isEmpty()) {
 
                // Check consecutive existing 1s
                for (int i = 0; i + 1 < ones.size(); i++) {
                    int l = ones.get(i);
                    int r = ones.get(i + 1);
 
                    if (r - l + 1 > bestLength) {
                        bestLength = r - l + 1;
                        bestL = l;
                        bestR = r;
                    }
                }
 
                int firstOne = ones.get(0);
                int lastOne = ones.get(ones.size() - 1);
 
                // Find first -1 before first 1
                for (int i = 0; i < firstOne; i++) {
                    if (a[i] == -1) {
                        int length = firstOne - i + 1;
 
                        if (length > bestLength) {
                            bestLength = length;
                            bestL = i;
                            bestR = firstOne;
                        }
 
                        break;
                    }
                }
 
                // Find last -1 after last 1
                for (int i = n - 1; i > lastOne; i--) {
                    if (a[i] == -1) {
                        int length = i - lastOne + 1;
 
                        if (length > bestLength) {
                            bestLength = length;
                            bestL = lastOne;
                            bestR = i;
                        }
 
                        break;
                    }
                }
 
            } else {
                // No existing 1s
                int firstMinus = -1;
                int lastMinus = -1;
 
                for (int i = 0; i < n; i++) {
                    if (a[i] == -1) {
                        if (firstMinus == -1) {
                            firstMinus = i;
                        }
                        lastMinus = i;
                    }
                }
 
                if (firstMinus != -1) {
                    bestL = firstMinus;
 
                    // If only one -1, it can become a single 1
                    if (firstMinus == lastMinus) {
                        bestR = firstMinus;
                    } else {
                        bestR = lastMinus;
                    }
                }
            }
 
            // Change all -1 to 0
            for (int i = 0; i < n; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
            }
 
            // Make selected endpoints 1
            if (bestL != -1) {
                a[bestL] = 1;
            }
 
            if (bestR != -1) {
                a[bestR] = 1;
            }
 
            // Print answer
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}