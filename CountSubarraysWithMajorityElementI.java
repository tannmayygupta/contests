public class CountSubarraysWithMajorityElementI {

    // Q2. Count Subarrays With Majority Element I 
    // https://leetcode.com/contest/biweekly-contest-169/problems/count-subarrays-with-majority-element-i/
    public static void main(String[] args) {

        int nums[] = {} ;
        int target = 0 ;

        System.out.println(countMajoritySubarrays(nums, target));
        
    }

    public static int countMajoritySubarrays(int[] nums, int target) {

        int ans = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            
            int cou = 0; // target elent kitne baar aara 
            
            for(int j = i ; j < nums.length ; j++){ 
                if(nums[j] == target){
                    cou++;
                }
                int sublength = j - i + 1 ;

                // this need to be check for ever subarray outer loop me kya hoga i,j ke subarray me chek kar raha tha vo jo neeche comment kiya hais tu
                if(cou > sublength / 2){
                    ans++;
                }
            }

            // if(cou > sublength / 2){
            //         ans++;
            // }
        }

        return ans ;
        
    }

}
