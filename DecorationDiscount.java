import java.util.Scanner;

public class DecorationDiscount {
    // https://www.codechef.com/START198D/problems/DECDISC
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int t = sc.nextInt();
		
		while(t!=0){
		    int N = sc.nextInt();
		    
		    int[] arr = new int[N] ;
		    
		    for(int i = 0 ; i < N ; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int minvalue = Integer.MAX_VALUE ;
		    
		    for(int j = 0 ; j < N - 1 ; j++){
		        int curval = 0 ;
		        curval += arr[j] + ( arr[j+1] ) / 2 ;
		        minvalue = Math.min(minvalue,curval);
		    }
		    
		    for(int m = 0 ; m < N ; m++ ){
		        for(int p = m + 1; p < N ; p++ ){
		            int cur = 0 ;
		            cur = arr[m]+arr[p];
		            minvalue = Math.min(cur,minvalue);
		        }
		    }
		    
		    System.out.println(minvalue);
		    
		    t--;
		}

    }
}
