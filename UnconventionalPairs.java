import java.util.Arrays;
import java.util.Scanner;
// B. Unconventional Pairs
// https://codeforces.com/contest/2149/problem/B
// Codeforces Round 1054 (Div. 3)

public class UnconventionalPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int max = Integer.MIN_VALUE ;
            
            for(int i = 0 ; i < n - 1 ; i += 2){
                int diff = arr[i] - arr[i+1];

                int modul = Math.abs(diff);

                if(max < modul){
                    max = modul ;
                }
            }

            System.out.println(max);

        }
    }
}
