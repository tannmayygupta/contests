import java.util.Scanner;
// Adding 123 to 4
// https://www.codechef.com/START223C/problems/ADD1234Layered Cake
public class Adding123to4 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		  //  int ans = x * 1 + y * 2 + z * 3 ;
		  
		  int ans = y / 2  + Math.min(x,z) ;
		    
		    System.out.println(ans);
		}

	}
}
