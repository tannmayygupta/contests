import java.util.Scanner;

public class NumberReduction {
    public static void main(String[] args) {
        
        // your code goes here
		Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
		while(t!=0){
		    
		    int X = sc.nextInt();
		    
		    while(X > 0){
		        if(X > 3){
		            X = X - 3 ;
		        }
		        else if(X % 2 == 0){
		            X = X / 2 ;
		        }
		        else{
		            break;
		        }
		    }
		    
		    System.out.println(X);
		    t--;
		}
    }
}
