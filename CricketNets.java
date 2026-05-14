import java.util.Scanner;

public class CricketNets {
    public static void main(String[] args) {
        // https://www.codechef.com/problems/CRNET
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int totalfare= 0 ;
            int x = sc.nextInt();
            if(x <= 20){
                totalfare = x * 10 ;
            }else{
                totalfare = 20 * 10 ;
                int runrem = x - 20 ;
                int ballneeded = runrem / 2 ;
                totalfare += ballneeded * 5 ;
            }
            
            System.out.println(totalfare);
        }
    }
}
