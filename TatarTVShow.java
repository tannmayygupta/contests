import java.util.Scanner;

public class TatarTVShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] cou = new int[k];
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '1'){
                    cou[i% k]++;
                }
            }

            boolean ans = true ;
            for(int i = 0 ; i < k ; i++){
                if(cou[i] % 2 != 0){
                    ans = false ;
                }
            }

            System.out.println(ans ? "YES" : "NO");
        }
    }
}
