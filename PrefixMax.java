import java.util.Scanner;

public class PrefixMax {
    // B. Prefix Max 
    // https://codeforces.com/contest/2185/problem/B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt() ;

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;
            }

            int max = Integer.MIN_VALUE ;
            int ind = -1 ;

            for(int i = 0 ; i < n ; i++){
                // max = Math.max(max, arr[i]);
                if(max > arr[i]){
                    max = arr[i];
                    ind = i ;
                }
            }

            int temp = arr[0];
            arr[0] = max ;
            arr[ind] = arr[0];

            // for

            System.out.println(max * n);

        }
    }
}