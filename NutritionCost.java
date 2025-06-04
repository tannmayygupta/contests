import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NutritionCost {
    public static void main(String[] args) {
        		 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t!=0){
            int n = sc.nextInt();
            
            int c = sc.nextInt();
            
            int[] arr = new int[n];
            
            int[] arr2 = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int j = 0 ; j < n ; j++){
                arr2[j] = sc.nextInt();
            }
            
            HashMap<Integer,Integer> min = new HashMap<>();
            
            for(int k = 0 ; k < n ; k++){
                int vit = arr[k] ;
                int cost = arr2[k];
                
                if(!min.containsKey(vit) || cost < min.get(vit)){
                    min.put(vit,cost);
                }
            }
            
            int totalvit = min.size();
            
            
            int totalcost = 0;

            for (int cost : min.values()) {
                
                totalcost += cost;
            
                
            }
            
            List<Integer> costs = new ArrayList<>(min.values());
            
            Collections.sort(costs); 
            
            int x = 0; 
            
            int y = 0;
            
            int maxValue = 0;
            
            for (int cost : costs) {
            
                int newX = x + 1;
                int newY = y + cost;
                int newValue = c * newX - newY;
            
                if (newValue > maxValue) {
                    maxValue = newValue;
                    x = newX;
                    y = newY;
                } else {
                    break;
                }
            }
            
            System.out.println(maxValue);

            t--;
        }
    }
}
