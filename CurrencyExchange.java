import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    int A1 = sc.nextInt();
		    int B1 = sc.nextInt();
		    int A2 = sc.nextInt();
		    int B2 = sc.nextInt();
		    
		    int intially = B1 + A1 * 5 ;
		    
		    int finalcoin = B2 + A2 * 5 ;
		    
		    int diff = intially - finalcoin ;
		    
		    if(intially < finalcoin){
		        System.out.println("No");
		    }
		    else if(diff % 6 == 0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		    t--;
		}
    }
}
