import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            String s = br.readLine().trim();
            char[] arr = s.toCharArray();
 
            if (arr[0] != arr[arr.length - 1]) {
                arr[arr.length - 1] = arr[0];
            }
 
            System.out.println(new String(arr));
        }
    }
}