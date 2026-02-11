import java.util.Scanner;

public class MaximumScore {
    // https://www.codechef.com/START225C/problems/MXSCWN
    // Maximum Score
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    int oddCou = 0 ;
		    int evenCou = 0 ;
		    int[] nums = new int[n];
		    
		    int[] nums2 = new int[n];
		    
		    for(int i = 0 ; i < n ; i++){
		        nums[i] = sc.nextInt();
		    }
		    
		    for(int i = 0 ; i < n ; i++){
		        nums2[i] = sc.nextInt();
		    }
		    
		    if(n == 1){
		        System.out.println(nums2[0]);
		        continue;
		      //break;
		    }
		    
		    int min = Integer.MAX_VALUE ;
		    int ind = 0 ;
		    for(int i = 0 ; i < n ; i++){
		        int diff = nums[i] - nums2[i];
		        
		        if(min > diff){
		          //  System.out.println("");
		          ind = i ;
		          min = diff ;
		        }
		    }
		    
		    int sum = 0 ;
		    
		    for(int i = 0 ; i < n ; i++){
		        if(i == ind){
		            sum+= nums2[i];
		        }else{
		            sum+= nums[i];
		        }
		    }
		    
		    System.out.println(sum);
		    
		}

 }
}