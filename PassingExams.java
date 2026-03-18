import java.util.Scanner;

public class PassingExams {
    public static void main(String[] args) {
        // your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    if( (x >= 50 && y >= 50 && z < 50) || (z >= 50 && y >= 50 && x < 50 ) || (x >= 50 && z >= 50 && y < 50) || (x >= 50 && y >= 50 && z >= 50) ){
		        System.out.println("Yes");
		    } else{
		        System.out.println("No");
		    }
		}
        
    }
}
