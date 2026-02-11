import java.util.ArrayList;
import java.util.Scanner;

public class AllEven {
// https://www.codechef.com/START225C/problems/ALLEV
// All Even
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
		    
		    for(int i = 0 ; i < n ; i++){
		        nums[i] = sc.nextInt();
		    }
		    
		    ArrayList<Integer> arr = new ArrayList<>();
		    
		    for(int i = 0 ; i < n ; i++){
		      //  nums[i] = sc.nextInt();
		      arr.add(nums[i]);
		    }
		    
		    
		    while(arr.size() > 1){
		        int sum = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
		        arr.set(arr.size() - 2 , sum);
		        arr.remove(arr.size() - 1);
		    }
		    
		    if(arr.get(0) % 2 == 0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}

	}


}