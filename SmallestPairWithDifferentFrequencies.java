import java.util.Arrays;
import java.util.HashMap;
// 3852. Smallest Pair With Different Frequencies 
// http://leetcode.com/problems/smallest-pair-with-different-frequencies/description/
public class SmallestPairWithDifferentFrequencies {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        System.out.println(Arrays.toString(nums));
    }

    public static int[] minDistinctFreqPair(int[] nums) {

        Arrays.sort(nums);
        
        int[] res = {-1 , - 1};

        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length ; 
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                map.put(nums[i],1);
            }
        }

        res[0] = nums[0];
        int freq = map.get(nums[0]);

        for(int i = 1 ; i < n ; i++){
            int val = map.get(nums[i]);
            if(val != freq && res[1] == -1){
                res[1] = nums[i];
            }
        }

        if(res[1]== -1){
            return new int[] {-1,-1};
        }


        return res ;

        // int minfreq = Integer.MAX_VALUE ;
        // int maxfreq = Integer.MIN_VALUE ;
        
        // for(int i = 0 ; i < n ; i++){
        //     int val = map.get(nums[i]);
        //     if(minfreq > val){
        //         minfreq = val ;
        //     }    

        //     if(maxfreq < val){
        //         maxfreq = val ;
        //     }    
        // }      

        // int minx = -1 ;
        // int maxy = 
        
    }
}