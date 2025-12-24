import java.util.Scanner;

public class ChristmasTrees {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A = sc.nextInt();
		
		int M = sc.nextInt();
		
		int B = sc.nextInt();
		
		int buy =( N * A ) ;
		
		int sell =  ( M * B) ;
		
		if(buy >= sell){
		    System.out.println("-"+(buy - sell));
		}else{
		    System.out.println(sell - buy);
		}
		
    }
}
