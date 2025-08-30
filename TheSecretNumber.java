import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheSecretNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){
            long n = sc.nextLong();

            List<Long> ans = new ArrayList<>();

            for(int i = 0 ; i <= 18 ; i++){
                long div = 1 + (long) Math.pow(10, i);

                if(n % div == 0){
                    ans.add((long) n / div );
                }

            }

            System.out.println(ans.size());

            if(!ans.isEmpty()){
                for(long j : ans){
                    System.out.print(j +" ");
                }
            }

            t--;

            System.out.println();
        
        }
    }
}
