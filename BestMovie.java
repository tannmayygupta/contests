import java.util.Scanner;

public class BestMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    int n = sc.nextInt();
		    
		    int[][] arr = new int[n][2];
		    
		    for(int i = 0 ; i < n ; i++){
		        arr[i][0] = sc.nextInt();
		        arr[i][1] = sc.nextInt();
		    }
		    
		    int out = mincost(arr,n);
		    
		    System.out.println(out);
		    
		    t--;
		}
    }

    public static int mincost(int[][] arr, int n){
	    int mini = 0 ;
	    boolean fla = false; // cant take zero as the cost of move can be 0 menas free
	    for(int i = 0 ; i < n ; i++){
	        if(arr[i][0] >= 7){
	            mini = Math.min(arr[i][1],mini);
                fla = true;
	        }
	    }
	    
	    if (!fla) {
            return -1;
        }
	    
	    return mini ;
	}
}
