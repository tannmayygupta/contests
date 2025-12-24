import java.util.ArrayList;
import java.util.Scanner;

public class DeletingArrayAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- != 0){
            int n = sc.nextInt();
            
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> cost = new ArrayList<>();
            
            for(int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }
            
            for(int i = 0; i < n; i++){
                cost.add(sc.nextInt());
            }
            
            long ans = 0;
            
            while(!arr.isEmpty()){
                
                int ind = -1;
                int min = Integer.MAX_VALUE;
        
                for(int i = 0; i < arr.size(); i++){
                    if(min > cost.get(i)){
                        min = cost.get(i); 
                        ind = i;
                    }
                }

                ans += (long) cost.get(ind) * arr.get(ind);
                arr.remove(ind); 
            }
            
            System.out.println(ans);
        }
    }
}
