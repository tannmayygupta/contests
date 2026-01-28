import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {
        
// https://www.codechef.com/START223C/problems/SCHOOLTRIP
// School Trip
// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    
		    
		  //  int studreqmorefortrip = x % k ;
		    
		  //  int remstudfortrip = n - x ;
		    
		    
		    
		  //  if(studreqmorefortrip != 0){
		  //      if(remstudfortrip == 0){
		  //          System.out.println(studreqmorefortrip);
		  //      }else{
		               
		  //      }
		  //  }
		  
		  int min = x ;
		  
		  for(int i = 0 ; i <= n ; i+=k){
		      min = Math.min(min,Math.abs(i - x));
		  }
		  
		  System.out.println(min);
		    
		}


    }
}
