import java.util.Arrays;

// Minimum Moves to Equal Array Elements III 
// https://leetcode.com/contest/biweekly-contest-169/problems/minimum-moves-to-equal-array-elements-iii/

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
