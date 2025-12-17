import java.util.Scanner;

public class ShizukuHoshikawaandFarmLegs {
    // A. Shizuku Hoshikawa and Farm Legs
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt() ;

            int cou = 0 ;

            for(int i = 0 ; i <= n  ; i++){
                for(int j = 0 ; j <= n ; j++){
                    if(2 * i + 4 * j == n){
                        cou++;
                    }
                }
            }

            System.out.println(cou);

        }
    }
}
