import java.util.Arrays;
import java.util.Scanner;
// Distinct Colors
// https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DISTINCTCOL
public class DistinctColors {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    
		    System.out.println(arr[n-1]);
		}

	}
}
