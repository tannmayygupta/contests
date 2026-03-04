import java.util.Scanner;
// https://www.codechef.com/viewsolution/1244278043
// Min And Operations
public class MinAndOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
	    while(t--!= 0){
	        int n =sc.nextInt();
	        int ans = 0 ;
	        
	        for(int i = 2 ; i <= n ;  i+=2){
	           ans += i ;
	        }
	        
	        System.out.println(ans);
	        
	    }
    }
}
