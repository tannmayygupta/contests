import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();
            
            long flips = m / k;
            

            long lflips = flips * k;
            
            if (lflips == m && m > 0) {
                lflips = (flips - 1) * k;
            }
            
            long timeSinFlip = m - lflips;
            
            long answer = (timeSinFlip > s) ? 0 : timeSinFlip;
            
            System.out.println(answer);
        }
        
        sc.close();
    }
}