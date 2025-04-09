import java.util.Scanner;

public class BreakingSticks {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
        
        while(t > 0){
            
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            
            int break1 = 0 ;
            
            for(int i = 0 ; i < n ; i++){
                break1 += BreakStick(arr[i]);
            }
            
            System.out.println(break1);
            
            t--;
        }
	}
	public static int BreakStick(int m){
            return m - 1; 	    
	}
}
