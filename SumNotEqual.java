import java.util.Arrays;
import java.util.Scanner;
// Sum Not Equal
// https://www.codechef.com/START229C/problems/NOTSUM
public class SumNotEqual {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    int[][] arr = new int[n][2];
		    
		    for(int i = 0 ; i < n ; i++){
		        arr[i][0] = sc.nextInt();
		        arr[i][1] = i+1;
		    }
		  
		    Arrays.sort(arr, (x,y) -> x[0] - y[0]);
		    
		    if (arr[0][0] + arr[1][0] != arr[n - 1][0]) {
                System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr[n - 1][1]);
            } else if (arr[n - 1][0] + arr[n - 2][0] != arr[0][0]) {
                System.out.println(arr[n - 1][1] + " " + arr[n - 2][1] + " " + arr[0][1]);
            } else {
                System.out.println(-1);
            }  
	
		}

	}
}
