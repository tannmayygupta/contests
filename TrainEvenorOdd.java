import java.util.Scanner;

public class TrainEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    int N = sc.nextInt();
		    
		    int[] arr = new int[N];
		    
		    for(int i = 0 ; i < N ;i++ ){
		        arr[i] =  sc.nextInt();
		    }
		    
		    int oddDayHours = 0 ;
		    int evenDayHours = 0 ;
		    for(int i = 0 ; i < N ; i++){
		        if(i % 2 == 0){
		            oddDayHours += arr[i];
		        }else{
		            evenDayHours += arr[i];
		        }
		    }
		    
		    System.out.println(Math.max(oddDayHours,evenDayHours));
		    t--;
        }
    }
}
