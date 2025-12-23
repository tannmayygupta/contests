import java.util.Scanner;

public class BlackslexandShowering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0; 
            int sum = 0;
            
            for (int i = 0; i < n - 1; i++) {
                sum += Math.abs(arr[i + 1] - arr[i]);
            }

            
            if (n >= 2) {
                int save = Math.abs(arr[1] - arr[0]);
                max = Math.max(max, save);
            }

            for (int k = 1; k < n - 1; k++) {
                int rm = Math.abs(arr[k] - arr[k - 1]) + Math.abs(arr[k + 1] - arr[k]);
                int add = Math.abs(arr[k + 1] - arr[k - 1]);
                int sav = rm - add;
                max = Math.max(max, sav);
            }

            if (n >= 2) {
                int savings = Math.abs(arr[n - 1] - arr[n - 2]);
                max = Math.max(max, savings);
            }

            System.out.println(sum - max);
        }
    }
}