import java.util.Scanner;

public class ColouredBalloons {
    public static void main(String[] args) {
        // https://www.codechef.com/problems/BALLOONS

        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    int sum = 0 ;
		    for(int i = 0 ; i < n ; i++){
		        sum = sum + (arr[i] * (i + 1));
		    }
		    
		    System.out.println(sum);
		}

        
    }
}
