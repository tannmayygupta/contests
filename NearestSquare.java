import java.util.Scanner;

public class NearestSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    
		    int N = sc.nextInt();
		    
		    int c = (int) Math.floor(Math.sqrt( (double) N));
		    
		    System.out.println((int) c*c);
		    
		    t--;
		}
        
    }
}
