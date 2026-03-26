import java.util.Scanner;

public class ImperfectNumbers {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    
		    int n = sc.nextInt();
		    
		    int up = n ;
		    
		    while(up > 0){
		        
		        if(up % 2 == 0 && up % 5 != 0){
		            break ;
		          //  System.out.println/
		        }else if(up % 2 != 0 && up % 5 == 0){
		            break ;
		        }else{
		            up--;   
		        }
		    }
		    
		    int up2 = n+1 ;
		    
		    while(up2 > 0){
		        if(up2 % 2 == 0 && up2 % 5 != 0){
		            break ;
		          //  System.out.println/
		        }else if(up2 % 2 != 0 && up2 % 5 == 0){
		            break ;
		        }else{
		            up2++;   
		        }
		    }
		    
		    int ans = (int) Math.min(Math.abs(n - up),Math.abs(n - up2));
		    
		    System.out.println(ans);
	
		}
	}
}
