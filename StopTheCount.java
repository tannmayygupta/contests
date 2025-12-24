import java.util.*;
import java.lang.*;
import java.io.*;

public class StopTheCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    String s = sc.next();
		    
		    int co1 = 0 ;
		    int ans = 0 ;
 		    int co0 = 0 ;
 		    
		    
		    for(int i = 0 ; i < n ; i++){
		        
		        char ch = s.charAt(i);
		        
		        if(ch == '1'){
		            co1++;
		        }else if(ch == '0'){
		            co0++;
		        }
		        
		        if(co1 > co0){
		            ans++;
		        }
		    }
		    
		    System.out.println(ans);
		}       
    }    
}