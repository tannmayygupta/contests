import java.util.Scanner;

public class PlayingwithToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n < m) {
            System.out.println("0");
        } else {
            int ans = n - m;
            System.out.println(ans);
        }
    }
}
