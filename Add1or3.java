import java.util.Scanner;

public class Add1or3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            long n = sc.nextInt();

            long m = sc.nextInt();

            long b = (m - n) % 2;

            if (b == 0 && m >= n && m <= n * 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
