// A. Games on the Train

import java.util.Scanner;

public class GamesontheTrain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }

            int ans = Integer.MIN_VALUE ;

            for(int i = 0 ; i < n ; i++){
                int k = max - arr[i] ;
                ans = Math.max(ans, k);
            }

            System.out.println(ans + 1);

        }
    }
}