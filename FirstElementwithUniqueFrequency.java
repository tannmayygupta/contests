import java.util.HashMap;
import java.util.Map;

public class FirstElementwithUniqueFrequency {
    public static void main(String[] args) {
        int[] arr = {20,10,30,30};
        System.out.println(firstUniqueFreq(arr));
    }
    public static int firstUniqueFreq(int[] nums) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (ans.containsKey(nums[i])) {
                int val = ans.get(nums[i]);
                ans.put(nums[i], val + 1);
            } else {
                ans.put(nums[i], 1);
            }
        }

        HashMap<Integer, Integer> unqmap = new HashMap<>();
        for(Map.Entry< Integer, Integer > entry : ans.entrySet()){
            int ky = entry.getKey();
            int val = entry.getValue();

            if(unqmap.containsKey(val)){
                int v = unqmap.get(val);
                unqmap.put(val,v+1);
            }else{
                unqmap.put(val,1);
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            int val = ans.get(n);

            int uq = unqmap.get(val);

            if(uq == 1){
                return nums[i];
            }
            
        }

        return -1 ;
    }
}
