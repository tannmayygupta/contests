import java.util.Arrays;
import java.util.Scanner;

public class MoreCookies {
    public static void main(String[] args) {
        // More Cookies
        Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();


        while(t-- != 0){
		    int N = sc.nextInt();
		    int C = sc.nextInt();
		    
		    int[] nums = new int[N];
		    
		    for(int i = 0 ; i < N ; i++){
		        nums[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(nums);
		    
		    int c1 = C ;

            while(true){
    		    int one = 0 ; 
		        int same = 0 ;

                for(int i = 0 ; i < N ; i++){
                    if(nums[i] < C){
                        one++;
                    }
                    if(nums[i] == C){
                        same++;
                    }
                }

                if(one >= 1 && same == 0 ){
                    break ;
                }

                C++;
            }
		    
		    System.out.println(C - c1);
            
        }
		
		// while(t-- != 0){
		//     int N = sc.nextInt();
		//     int C = sc.nextInt();
		    
		//     int[] nums = new int[N];
		    
		//     for(int i = 0 ; i < N ; i++){
		//         nums[i] = sc.nextInt();
		//     }
		    
		//     Arrays.sort(nums);
		    
		//     int one = 0 ; 
		//     int same = 0 ;
		    
		//     int c1 = C ;
		    
		//     while(one >= 1 && same == 0){
		//         one = 0 ;
		//         same = 0 ;
		//         for(int i= 0 ; i < nums.length ; i++){
		//             if (nums[i] < C){
		//                 one++;
		//             } 
		//             if(nums[i] == C){
		//                 C++;
		//                 same++;
		//             }
		//         }
		//     }
		    
		//     System.out.println(C - c1);

        // }
    }
}
