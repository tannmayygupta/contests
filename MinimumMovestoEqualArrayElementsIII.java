import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsIII {

    public static int minMoves(int[] nums) {

        Arrays.sort(nums);

        int ans = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            ans += nums[nums.length - 1] - nums[i] ;
        }

        return ans ;
        
    }
    public static void main(String[] args) {
        int[] nums = {};

        System.out.println(minMoves(nums));
    }
}
