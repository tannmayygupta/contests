import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            // if(k > s){
            //     System.out.println("0");
            //     continue;
            // }
            // 16 7 7
            long lflip = m % k ;
            if(lflip == 0){
                lflip = k;
            }

            if(lflip > s){
                System.out.println("0");
            }else{
                System.out.println(lflip);
            }

            // while (m > (lflip + k) ) {
            //     lflip += k ;
            //     // m-=k;
            // }

            // if((m - lflip)  s){
            //     System.out.println("0");
            // }else{
            //     System.out.println(m - lflip);
            // }
            
            // System.out.println(Math.max(s, m-lflip));
        }
    }
}
