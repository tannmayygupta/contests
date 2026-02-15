import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/toggle-light-bulbs/description/
// 3842. Toggle Light Bulbs
public class ToggleLightBulbs {
    public static void main(String[] args) {
        // int[] arr = {10,30,20,10};
    }
    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        // HashMap<Integer, boolean> map = 

        int[] arr = new int[101];

        for(int i = 0 ; i < bulbs.size() ; i++){
            arr[bulbs.get(i)]++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1 ; i < 101 ; i++){
            if(arr[i] % 2 != 0){
                ans.add(i);
            }
        }

        return ans ;
        
    }
}
