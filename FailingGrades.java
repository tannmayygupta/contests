import java.util.Scanner;

public class FailingGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- != 0){
            int N = sc.nextInt();
            
            int[] arr = new int[N];
            
            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
            }
            
            int sum = 0 ;
            
            int flag = 0 ;
            
            for(int i = 0 ; i < N ; i++){
                sum += arr[i] ;
                int avg = sum / (i + 1) ; 
                if(avg < 40){
                    flag = 1 ;
                    break;
                }
            }
            
            if(flag == 1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        
    }
}
