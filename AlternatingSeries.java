import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {
            int N = sc.nextInt();

            int nums[] = new int[N];

            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    nums[i] = -1;
                } else if (i == N - 1) {
                    nums[i] = 2;
                } else {
                    nums[i] = 3;
                }
            }

            for (int i = 0; i < N - 1; i++) {
                System.out.print(nums[i]+" ");
            }

            System.out.print(nums[N - 1]);

            System.out.println();

            t--;
        }
    }
}
