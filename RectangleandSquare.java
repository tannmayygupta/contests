import java.util.Scanner;

public class RectangleandSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		int areaRect = A * B ;
		
		int areaSq = C * C ;
		
		if(areaRect == areaSq){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}

	}
}
