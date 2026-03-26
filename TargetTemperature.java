import java.util.HashSet;
import java.util.Scanner;

public class TargetTemperature {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!= 0){
		    int n = sc.nextInt();
		    int[] b = new int[n];
		    
		    int max = 0 ;
		    
		    for(int i = 0 ; i < n ; i++){
		        b[i] = sc.nextInt();
		        if(max < b[i]){
		            max = b[i]; 
		        }
		    }
		    
		    HashSet<Integer> sett = new HashSet<>();
		    
		    boolean ohhyesh = true ;
		    
		    for(int i = 0 ; i < n ; i++){
		        if(b[i] < max && !sett.add(b[i])){
		            ohhyesh = false ;
		            break;
		        }
		    }
		    
		    if(ohhyesh){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		    
		}

	}
}
