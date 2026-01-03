import java.util.HashMap;
// Q2. Minimum Subarray Length With Distinct Sum At Least K©leetcode
// https://leetcode.com/contest/biweekly-contest-173/problems/minimum-subarray-length-with-distinct-sum-at-least-k/description/
public class MinimumSubarrayLengthWithDistinctSumAtLeastK {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int k = 4 ;
        System.out.println(minLength(nums, k));
    }

    public static int minLength(int[] nums, int k) {
        // List<Integer> ans = new ArrayList<Integer>();
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(ans.costains)
        // }
        int left = 0;
        long sum = 0;  
        int minsize = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                sum += nums[i];
            }
            
            if(map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                map.put(nums[i], val + 1);
            } else {
                map.put(nums[i], 1);
            }
            
            while(sum >= k) {
                minsize = Math.min(minsize, i - left + 1);
                
                if(map.containsKey(nums[left])) {
                    int val = map.get(nums[left]);
                    map.put(nums[left], val - 1);
                    
                    if(map.get(nums[left]) == 0) {
                        map.remove(nums[left]);
                        sum = sum - nums[left];
                    }
                }
                
                left++;
            }
        }

        if(Integer.MAX_VALUE == minsize){
            return -1 ;
        }

        return minsize ;
    }
}
