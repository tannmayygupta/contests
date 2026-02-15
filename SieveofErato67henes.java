import java.util.Scanner;
// A. Sieve of Erato67henes
// https://codeforces.com/contest/2195/problem/A

public class SieveofErato67henes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean one = false;
            boolean sixseven = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    one = true;
                }
                if (arr[i] == 67) {
                    sixseven = true;
                }
            }

            if (sixseven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
