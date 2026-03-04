import java.util.HashSet;
import java.util.Scanner;

public class ColorFestival {
    public static void main(String[] args) {
        
        // your code goes here
        Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
	    while(t--!= 0){
	        int n =sc.nextInt();
	        HashSet<Integer> ans = new HashSet<>();
	        int[] arr = new int[n];
	        for(int i = 0 ; i < n ; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        for(int i = 0 ; i < n ;  i++){
	            ans.add(arr[i]);
	        }
	        
	        System.out.println(ans.size());
        }
    }
}
