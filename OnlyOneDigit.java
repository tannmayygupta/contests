import java.util.Scanner;
// A. Only One Digit

// https://codeforces.com/contest/2126
public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int x = sc.nextInt();

            System.out.println(smallestdigit(x));
        }
        
    }

    static int smallestdigit(int x){

        int min = Integer.MAX_VALUE;

        while(x > 0){
            
            int rem = x % 10 ;
            min = Math.min(min, rem);
            x = x / 10 ;
        }

        return min ;
    }
}
