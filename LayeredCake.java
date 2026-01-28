import java.util.Scanner;

public class LayeredCake {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        // Layered Cake
        // https://www.codechef.com/problems/LAYERCAKE
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    int m = sc.nextInt();
		    
		    int[] a = new int[n];
		    int[] b = new int[m];
		    
		    for(int i = 0 ; i < n ; i++){
		        a[i] = sc.nextInt();
		    }
		    
		    for(int i = 0 ; i < m ; i++){
		        b[i] = sc.nextInt();
		    }
		    int ans = 0 ;
		    
		    for(int i = 0 ; i < m ; i++){
		        for(int j = 0 ; j < n ; j++){
		            if(b[i] < a[j]){
		                ans++;
		            }
		        }
		    }
		    
		    System.out.println(ans);
		}

	}
}
