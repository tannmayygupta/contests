// https://www.codechef.com/START191D/problems/ADDGCD



import java.util.Scanner;

public class AddtogetGCD {
    public static void main(String[] args) {
        // your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		
		int t  = sc.nextInt();
		
		while(t!=0){
		    
            int X = sc.nextInt();
            int Y = sc.nextInt();
    		
    		
    		int ops = 0;
            
            while (ops < 2) {
            
            if (gcd(X + ops, Y) > 1||gcd(X, Y + ops) > 1) {
                    break;
                }
                ops++;
            }

            System.out.println(ops);
    		    
		    t--;
		}
	

	}
    public static int gcd(int X , int Y){
	    while(Y!= 0){
	        int temba = Y;
	        Y = X % Y ;
	        X = temba ;
	    }
	    
	    return X ;
	}
}
