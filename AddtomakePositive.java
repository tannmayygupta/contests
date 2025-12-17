import java.util.Scanner;

public class AddtomakePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            int sum = 0;
            int x = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            // x = Math.max(0 , Math.abs( (int) Math.ceil( (double) (sum / n ) )) );
            x = Math.max(0, (int) Math.ceil((double) -sum / n));
            System.out.println(x);
        }
    }
}
