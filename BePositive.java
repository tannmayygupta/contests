import java.util.Scanner;
// Codeforces Round 1054 (Div. 3)
// https://codeforces.com/contest/2149/problem/A
// A. Be Positive
public class BePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            int[] freq = new int[3] ;

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;

                if(arr[i] == 0){
                    freq[1]++;
                }
                else if(arr[i] == -1){
                    freq[0]++;
                }
                else{
                    freq[2]++;
                }
            }

            int ans = 0 ;

            if(freq[0] % 2 != 0){
                ans += 2 ;
            }
            
            ans = ans + freq[1] * 1 ;

            System.out.println(ans);

        }
    }
}
