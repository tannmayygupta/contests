import java.util.Scanner;
// https://codeforces.com/contest/2131/problem/A
// A. Lever
public class Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {

            int N = sc.nextInt();

            int[] a = new int[N];

            int[] b = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }

            int cou = 1;

            for(int i = 0 ; i < N ; i++){
                if(a[i] > b[i]){
                    cou += a[i] - b[i]; 
                }
            }

            System.out.println(cou);

            t--;
        }
    }
}
