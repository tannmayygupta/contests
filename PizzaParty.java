import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int boys = A + 1;
		
		int girls = B * 3 ;
		
		int bois = boys * 4 ;
		
		int total = bois + girls ;
		
		int ans = (int) Math.ceil(total/8.0 );
		
		System.out.println(ans);   
    }
}
