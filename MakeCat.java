import java.util.Scanner;

public class MakeCat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    int N = sc.nextInt();
		    
		    int[] A1 = new int[N];
		    
		    int[] B1 = new int[N];
		    
		    for(int i = 0 ; i < N ; i++){
		        A1[i] = sc.nextInt();
		    }
		    
		    for(int j = 0 ; j < N ; j++){
		        B1[j] = sc.nextInt();
		    }
		    
		    int mex1 = mex(A1,N);
		    
		    int mex2 = mex(B1,N);
		    
		    System.out.println(Math.min(mex1,mex2));
		
		    t-- ;
		    
		}
		
		

	}
	
	static int mex(int[] arr , int N){
	        int k = 0 ; 
		    
		    while(k < N){
		        if(arr[k] < N && arr[k] != arr[arr[k]]){
		            int ind = arr[k];
		            int temp = arr[ind];
		            arr[ind] = arr[k];
		            arr[k] = temp ;
		        }else{
		            k++;
		        }
		    }
		    
		    for(int q = 0 ; q < N ; q++){
		        if(arr[q] != q){
		            return q ;
		        }
		    }
		    
		    return N - 1 ;
	}
}
