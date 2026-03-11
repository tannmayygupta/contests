import java.util.Scanner;
// Sequential Clamp
// https://www.codechef.com/START229C/problems/SEQCLAMP
public class SequentialClamp {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    int[][] arr = new int[n][2];
		    
		    for(int i = 0 ; i < n ; i++){
		        for(int j = 0 ; j < 2 ; j++){
		            arr[i][j] = sc.nextInt();
		        }
		    }
		    int bestY = 0 ;
		    for(int x = 0 ; x < 10001 ; x++){
		        int y = x ;
		        for(int i = 0 ; i < n ; i++){
		            int ai = arr[i][0] ;
		            int bi = arr[i][1] ;
		            if(y < ai){
		                y = ai ;
		            }else if(y > bi){
		                y = bi;
		            }
		        }
		        bestY = Math.max(bestY,y);
		    }
		    
		    System.out.println(bestY);
		}

	}
}
