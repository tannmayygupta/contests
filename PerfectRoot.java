import java.util.Scanner;

public class PerfectRoot {
    public static void main(String[] args) {
        // tc : 
        //  input :    3
                    // 1
                    // 2
                    // 5

        // output :    1
                    // 2 4
                    // 2 102 43 1 21

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t--!= 0) {
            int n = sc.nextInt();

            for(int i = 0 ; i < n ; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
