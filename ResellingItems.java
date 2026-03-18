import java.util.Arrays;
import java.util.Scanner;
// https://www.codechef.com/problems/RESELL?tab=submissions 
// Reselling Items
public class ResellingItems {
    public static void main(String[] args) {
        // your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[x];
		    
		    for(int i = 0 ; i < x ; i++){
		        arr[i]= sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int i = 0 ;
		    int prof = 0 ;
		  //  while(k>0){
		  //      int buyf = (arr[i] - 5) ;
		        
		  //      prof = prof + buyf ;
		  //      i++;
		  //      k--;
		  //  }
		  //  int rem = x - k ;
		  //  while(rem > 0){
		  //      prof = prof + (arr[i] - 10) ;
		  //      i++;
		  //      rem--;
		  //  }
		  
		    i = x - 1 ;
		    while(k > 0){
		        int cost = arr[i];
		        if(cost > 5){
		            prof = prof + (arr[i] - 5) ;
		        }
		        i--;
		        k--;
		    }
		    
		    while(i >= 0){
		        int cost = arr[i];
		        if(cost > 10){
		            prof = prof + (arr[i] - 10) ;
		        }
		        i--;
		      //  k--;
		    }
		    
		    System.out.println(prof);
		    
		}

    }
}
