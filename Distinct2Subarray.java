import java.util.HashSet;
import java.util.Scanner;

public class Distinct2Subarray {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t!=0){
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            
            HashSet<Integer> ans = new HashSet<Integer>();
            
            for(int j = 0 ; j < n ; j++){
                ans.add(arr[j]);
            }
            
            if(ans.size() >= 2){
                System.out.println("2");
            }
            else{
                System.out.println("-1");
            }
            t--;
        }
           
    }
}
