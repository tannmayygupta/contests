import java.util.Scanner;

public class CheckOddEvenDivisors {

    // https://www.codechef.com/START193D/problems/ODDEVENDIV
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t != 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(heya(A, B)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            
            t--;
        }
    }

    public static boolean heya(int A, int B) {
        
        if(A <= 0) {
            return false;
        }
        
        if(B == 0) {
            return true;
        } else {
            return (B % A == 0);
        }
    }
}
