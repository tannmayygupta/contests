import java.util.Scanner;

public class CountOddEvenDivisor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!= 0){
		    int N = sc.nextInt();
		    
		    System.out.println(odd(N)+" "+even(N));
		    
		    t--;
		}

	}
	public static int odd(int N){
	    
	    int count = 0 ;
	    
	    int divisor = 1 ;
	    while(divisor <= N){
	        if(N % divisor == 0){
	            count++;
	           // divisor += 2 ;
	        } 
	        divisor += 2 ;
	    }
	    
	    return count ;
	}
	public static int even(int N){
	    int count = 0 ;
	    int divisor = 2 ;
	    while(divisor <= N){
	        if(N % divisor == 0){
	            count++;
	           // divisor += 2 ;
	        } 
	        divisor += 2 ;
	    }
	    return count ;
	}
}
