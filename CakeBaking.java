import java.util.Scanner;
// Cake Baking
// https://www.codechef.com/START219D/problems/CAKEBAKE7
public class CakeBaking {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int ans = m - n ;
		
// 		Math.min(ans,m);
		
		System.out.println(Math.min(ans,n));

	}
}
