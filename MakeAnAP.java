import java.util.Scanner;

public class MakeAnAP {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        // we have to find d is nothingb but smallest comman diffrence no of thime

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long d = 0;

            for (int i = 0; i < n - 1; i++) {
                long diff = arr[i + 1] - arr[i];
                d = commondiff(d, diff);
            }

            long a1 = arr[0];
            long an = arr[n - 1];

            long aplength = (an - a1) / d + 1;

            long ans = aplength - n;

            System.out.println(ans);
        }

    }

    static long commondiff(long d, long diff) {
        if (diff == 0) {
            return d;
        }
        return commondiff(diff, d % diff);
    }
}
