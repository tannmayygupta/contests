import java.util.ArrayList;
import java.util.Arrays;

public class FinalElementAfterSubarrayDeletions {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 3};
        System.out.println(finalElement(nums));
        
    }
    // Q2. Final Element After Subarray Deletions©leetcode
    public static int finalElement(int[] nums) {

        Arrays.sort(nums);
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            ans.add(nums[i]);
        }

        int i = 0 ;
        int j = 0 ;
        int cou = 0 ;

        while(ans.size() != 1){
            //alice chance 0 2 4
            if(cou % 2 == 0){
                ans.remove(i);
            }
            // bob chance 1 3 5
            else{
                ans.remove(j);
            }
            j = ans.size() - 1 ;
            cou++;
        }

        return ans.get(0);
    }
}
