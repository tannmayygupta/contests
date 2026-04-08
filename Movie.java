import java.util.Scanner;
// https://www.codechef.com/START233C/problems/MOVIE7
// Movie
public class Movie {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int mincom = Math.min(n,m);
		    
		    if(n > m){
		        int rem = n - m ;
		        int ans = c * mincom + rem * a ;
		        System.out.println(ans);
		    }else{
		        int rem = m - n ;
		        int ans = c * mincom + rem * b ;
		        System.out.println(ans);
		    }
		}

	}
}
