import java.util.HashSet;

public class MinimumOperationstoReachTargetArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] target = {2,1,3};

        System.out.println(minOperations(nums, target));
        
    }
    
    public static int minOperations(int[] nums, int[] target) {

        HashSet<Integer> set = new HashSet<>();
    
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != target[i]){
                set.add(nums[i]);
            }
        }
    
        return set.size();
    }

    
    // my way but this gives tle the above is the optimised way to do it 
    // bruteforce approach what que says
    
    //     int cou = 0 ;

    //     while(true){

    //         // int x = -1 ;
    //         // int segStart = - 1 ;
    //         // int segEnd = -1 ;

    //         // //// if array match we terminate the condition 
    //         // if(match(nums , target)){
    //         //     break ;
    //         // }

                    
    //         // for(int i = 0 ; i < nums.length ; i++){
    //         //     if(nums[i] != target[i] && x== -1){
    //         //         x = nums[i];
    //         //         segStart = i ; 
    //         //         segEnd = i ; // if end not found for the segment means a value is present only once
    //         //     }
    
    //         //     if(x == nums[i] && i != nums.length - 1){
    //         //         segEnd = i ;
    //         //     }
    
    //         // }

    //         // if(segStart == -1){
    //         //     break ;
    //         // }

    //         // for(int j = segStart ; j <= segEnd ; j++){
    //         //     nums[j] = target[j];
    //         // // }

    //         if(match(nums, target)){
    //             break;
    //         }
            
    //         int x = -1;
            
    //         // Find first mismatch
    //         for(int i = 0; i < nums.length; i++){
    //             if(nums[i] != target[i]){
    //                 x = nums[i];
    //                 break;  // Just find x, don't find segments here
    //             }
    //         }
            
    //         if(x == -1){
    //             break;
    //         }
            
    //         // Now find ALL maximal contiguous segments with value x
    //         int i = 0;
    //         while(i < nums.length){
    //             if(nums[i] == x){
    //                 int segStart = i;
    //                 int segEnd = i;
                    
    //                 // Extend segment while consecutive values are x
    //                 while(segEnd + 1 < nums.length && nums[segEnd + 1] == x){
    //                     segEnd++;
    //                 }
                    
    //                 // Update this segment
    //                 for(int j = segStart; j <= segEnd; j++){
    //                     nums[j] = target[j];
    //                 }
                    
    //                 // Move i past this segment
    //                 i = segEnd + 1;
    //             } else {
    //                 i++;
    //             }
    //         }
            

    //         cou++;
            
    //     }

    //     return cou ;
    // }

    // public boolean match(int[] nums , int[] target){

    //     for(int i = 0 ; i < nums.length ; i++){
    //         if(nums[i]!= target[i]){
    //             return false;
    //         }
    //     }
    //     return true ;
    // }

}