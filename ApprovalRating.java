import java.util.Arrays;
import java.util.Scanner;

public class ApprovalRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        
        while(t > 0){
            
            int[] arr = new int[5];
            
            for(int i = 0 ; i < 5 ; i++){
                
                arr[i] = sc.nextInt();
                
            }
            
            int mincoin = minCoin(arr);
            
            System.out.println(mincoin);
            
            t--;
        }
    }

    public static int minCoin(int[] arr){
	   // int sum = 0 ;
	   // int count = 0 ;
	   // for(int i = 0 ; i < 5 ; i++){
	   //     if(arr[i] == 0){
	   //         count++;
	   //     }
	   //     sum += arr[i];
	   // }
	    
	   //// int avg = sum / 5 ;
	    
	   // if(sum >= 35){
	   //     return 0;
	   // }
	   // else{
	   //     return count*100 ;
	   // }
	   
	   int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        

        if (sum >= 35) {
            return 0;
        }
        

        Arrays.sort(arr);
        
        int bribes = 0;

        for (int i = 0; i < 5; i++) {
            if (sum >= 35) {
                break;
            }

            sum = sum - arr[i] + 10;
            bribes++;
        }
        
        return bribes * 100;
	}
    
}
