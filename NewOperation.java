import java.util.ArrayList;
import java.util.Scanner;
// New Operation
// https://www.codechef.com/START219D/problems/NEWOP
public class NewOperation {
    public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0 ){
		    
            int n = sc.nextInt();
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i = 0 ; i < n ; i++){
                arr.add(sc.nextInt());
            }
            System.out.println(operationformin(arr)+" "+operationformax(arr));
		}
	}
	
	public static int operationformin(ArrayList<Integer> arr){
	   // if(arr.size() == 1){
	   //     return new int[] {arr.get(0),arr.get(0)};
	   // }
	    
	   // for(int i = 0 ; i < arr.size() ; i++){
	   //     ArrayList<Integer> new ArrayList = new ArrayList<Integer>
 	  //  }
 	  ArrayList<Integer> min = new ArrayList<>();
            
        for(int i = 0 ; i < arr.size() ; i++){
            min.add(arr.get(i));
        }
 	  
 	  while(min.size() - 1> 0){
 	      int x = min.get(0) + min.get(1)*2 ;
 	      
 	      min.remove(1);
 	      min.remove(0);
 	      
 	      min.add(0,x);
 	  }
 	  return min.get(0);
	}
	
	public static int operationformax(ArrayList<Integer> arr){

 	  ArrayList<Integer> max = new ArrayList<>();
            
        for(int i = 0 ; i < arr.size() ; i++){
            max.add(arr.get(i));
        }
 	  
 	  while(max.size() - 1 > 0){
 	      int i = max.size() - 2 ;
 	      int x = max.get(i) + max.get(i+1)*2 ;
 	      
 	      max.remove(i+1);
 	      max.remove(i);
 	      
 	      max.add(i,x);
 	  }
 	  
 	  return max.get(0);
	}
}
