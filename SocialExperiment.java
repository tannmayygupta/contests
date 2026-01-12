import java.util.Scanner;
 
public class SocialExperiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t--!=0) {
            int n = sc.nextInt();
 
            int ans = Integer.MAX_VALUE ;
 
            // for(int i = 0 ; i <= n/2 ; i++){
            //     for(int j = 0 ; j <= n/2 ; j++){
            //         if(2*i + 3*j == n){
            //             ans = Math.min(ans , Math.abs(2*i - 3*j));
            //         }
            //     }
            // }
 
            if(n == 2 || n == 3){
                System.out.println(n);
                continue  ;
            }
 
            if(n%2 == 0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
    }
}