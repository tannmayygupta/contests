import java.util.Scanner;

public class OnesandZeroesI {
    public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		
		while(t--!=0){
		    int cou = 0 ;
		    		
		    int n= sc.nextInt();
		    
		    String s = sc.next();
		    
		  //  for(int i = 0 ; i < n ; i++){
		  //      if(fs(s.substring(0,i+1))){
		  //          cou++;
		  //      }
		  //  }
		    
		    int cou1 = 0 ;
	    
    	    for(int i = 0 ; i < s.length() ; i++){
    	        if(s.charAt(i) == '1'){
    	            cou1++;
    	        }else{
    	            cou1--;
    	        }
    	        
    	        if(cou1 >= 0){
    	            cou++;    
    	        }
    	    } 
    	    
    	    System.out.println(cou);
    	    
		}
	    
	   // return cou ;
	   

	}
	
// 	public static boolean fs(String s){
// 	    int cou1 = 0 ;
// 	    int cou2 = 0 ;
	    
// 	    for(int i = 0 ; i < s.length() ; i++){
// 	        if(s.charAt(i) == '1'){
// 	            cou1++;
// 	        }else{
// 	            cou2++;
// 	        }
// 	    }
	    
// 	    return (cou1 >= cou2)? true : false ;
// 	}
}
