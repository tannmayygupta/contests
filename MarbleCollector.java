import java.util.Arrays;
import java.util.Scanner;
// Marble Collector
// https://www.codechef.com/START195D/problems/MARBCOLL
public class MarbleCollector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- != 0){
		    int N = sc.nextInt();
		    
		    int M = sc.nextInt();
		    
		    int[] arr = new int[N];
		    
		    int[] M1 = new int[M + 1] ;
		    
		    for(int i = 0 ; i < N ; i++){
		        arr[i] = sc.nextInt();
		        M1[arr[i]]++;
		    }
		    
		    Arrays.sort(M1);
		    
		    int count = 0 ;
		    
		    for(int j = M1.length - 1 ; j >= 1 ; j-- ){
		        if(M1[j] > 0){
		            count++;
		        }
		    }
		    
		    System.out.println(M - count);
		}
    }
}
