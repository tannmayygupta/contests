import java.util.Scanner;

public class SubsetSum3 {
    public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    int N = sc.nextInt();
		    
		    int[] arr = new int[N];
		    
		    for(int i = 0 ; i < N ;i++ ){
		        arr[i] =  sc.nextInt();
		    }
		    
		    int sum = 0 ;
		    
		    int flag = 0 ;
		    
		    for(int i = 0 ; i < N ; i++){
		        sum = 0 ;
		        for(int j = i ; j < N ; j++){
		            sum += arr[j];
		            if(sum % 3 == 0){
		                flag = 1 ;
		                break ;
		            }
		        }
		    }
		    
		    if(flag == 1){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}   
    }
}
