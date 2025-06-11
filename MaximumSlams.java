import java.util.Scanner;

public class MaximumSlams {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		double m1 = (25 - X) / 4.0 ;
		
		int ans = (int) Math.ceil( m1 ) ;
		
		System.out.println(ans);   
    }
}
